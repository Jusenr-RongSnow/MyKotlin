package com.myself.mykotlin.http.interceptor;

import com.myself.mykotlin.http.progress.ProgressResponseBody;
import com.myself.mykotlin.http.progress.ProgressResponseListener;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * 进度拦截器
 * Created by guchenkai on 2015/10/26.
 */
public class ProgressInterceptor implements Interceptor {
    private ProgressResponseListener progressListener;

    public ProgressInterceptor(ProgressResponseListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
    }
}
