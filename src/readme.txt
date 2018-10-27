回调函数

1. 执行 worker.doWorker() 方法

2. 构造一个bean对象 data(1,0)

3. 构造一个myfetcher对象，并将data(1,0)传入到myfetcher对象中

4. 调用myfetcher.fetchData()方法

5. myfetcher.fetchData()中需要传入一个对象 FetcherCallback对象的实现类

6. 在fetchData()方法中，用FetcherCallback对象的实现类的onData()方法，将myfetcher中的data传入

7. 方法中有try catch机制，如果执行有异常抛出，则调用用FetcherCallback对象的实现类的onError()方法

回调的核心在于：在一个方法中，调取另一个对象的方法，并获取结果，对获取的结果进行一定的处理，并将获取的结果返回