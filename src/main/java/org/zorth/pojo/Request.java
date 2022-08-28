package org.zorth.pojo;

/**
 * @author nicolas
 */
public class Request<T> {
    private T reqBody;

    public T getReqBody() {
        return reqBody;
    }

    public void setReqBody(T reqBody) {
        this.reqBody = reqBody;
    }
}
