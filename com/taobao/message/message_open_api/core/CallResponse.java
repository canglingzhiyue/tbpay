package com.taobao.message.message_open_api.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class CallResponse<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public T data;
    public String errCode;
    public String errMsg;
    public String platform = "android";
    public String type;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ResponseType {
        public static final String COMPLETE = "complete";
        public static final String ERROR = "error";
        public static final String NEXT = "next";
    }

    static {
        kge.a(-1121758952);
    }

    public static CallResponse next(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CallResponse) ipChange.ipc$dispatch("a46e646f", new Object[]{obj});
        }
        CallResponse callResponse = new CallResponse();
        callResponse.type = "next";
        callResponse.data = obj;
        return callResponse;
    }

    public static Map<String, Object> next2map(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("47a74875", new Object[]{obj});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", "next");
        hashMap.put("data", obj);
        return hashMap;
    }

    public static CallResponse error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CallResponse) ipChange.ipc$dispatch("42cd917c", new Object[]{str, str2});
        }
        CallResponse callResponse = new CallResponse();
        callResponse.type = "error";
        callResponse.errCode = str;
        callResponse.errMsg = str2;
        return callResponse;
    }

    public static Map<String, Object> error2map(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5abbcd82", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", "error");
        hashMap.put("errCode", str);
        hashMap.put("errMsg", str2);
        return hashMap;
    }

    public static CallResponse complete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CallResponse) ipChange.ipc$dispatch("206f7ed9", new Object[0]);
        }
        CallResponse callResponse = new CallResponse();
        callResponse.type = "complete";
        return callResponse;
    }

    public static Map<String, Object> complete2map() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4287285f", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", "complete");
        return hashMap;
    }
}
