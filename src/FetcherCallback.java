public interface FetcherCallback {
    Data onData(Data data) throws Exception;

    Data onError(Throwable cause);
}
