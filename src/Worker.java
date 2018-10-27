public class Worker {
    public  void doWork(){
        Fetcher fetcher =new MyFetcher(new Data(1,0));
        fetcher.fetchData(new FetcherCallback() {
            @Override
            public Data onData(Data data) throws Exception {
                Thread.sleep(5000);
                System.out.println("Data received: "+data);
                return new Data(5,10);
            }

            @Override
            public Data onError(Throwable cause) {
                System.out.println("An error accour: "+cause.getMessage());
                return new Data(50,100);
            }
        });
    }

    public static void main(String[] args) {
        Worker worker =new Worker();
        worker.doWork();
    }

}
