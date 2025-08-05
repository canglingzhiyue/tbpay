package com.taobao.augecore.network;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes6.dex */
public class NetworkResponse implements Serializable {
    public String errorCode;
    public String errorMsg;
    public boolean isSuccess;
    public String jsonData;
    public BaseOutDo pojo;
}
