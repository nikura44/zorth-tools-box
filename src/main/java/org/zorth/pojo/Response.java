package org.zorth.pojo;

/**
 * @author nicolas
 */
public class Response<T> {
    private T respBody;

    public T getRespBody() {
        return respBody;
    }

    public void setRespBody(T respBody) {
        this.respBody = respBody;
    }
}
