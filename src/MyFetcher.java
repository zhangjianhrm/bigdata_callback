public class MyFetcher  implements  Fetcher{
    final  Data data;

    public  MyFetcher(Data data){
        this.data=data;
    }

    @Override
    public void fetchData(FetcherCallback callback){
        System.out.println("callback.onData running1");
        final Data[] d1 = {new Data(0,0)};
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    d1[0] =callback.onData(data);
                }catch (Exception e){
                    d1[0]=callback.onError(e);
                }
            }
        }).start();
        System.out.println(d1[0].m);
        System.out.println("callback.onData running2");
        System.out.println(d1[0].n);
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(d1[0].m);

    }
}
