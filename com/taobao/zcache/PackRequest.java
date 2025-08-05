package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class PackRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Error error;
    private final String info;
    private final String name;
    private int progressId;
    private String traceId;

    static {
        kge.a(28203330);
    }

    public PackRequest(String str) {
        this.traceId = null;
        this.progressId = 0;
        this.error = null;
        this.name = str;
        this.info = null;
    }

    public PackRequest(String str, String str2) {
        this.traceId = null;
        this.progressId = 0;
        this.error = null;
        this.name = str;
        this.info = str2;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public String getInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ed0ac055", new Object[]{this}) : this.info;
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this}) : this.traceId;
    }

    public void setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this.traceId = str;
        }
    }

    public int getProgressId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b73f198", new Object[]{this})).intValue() : this.progressId;
    }

    public void setProgressId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e14f72", new Object[]{this, new Integer(i)});
        } else {
            this.progressId = i;
        }
    }

    public Error getError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("6e37ef76", new Object[]{this}) : this.error;
    }

    public void setError(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2e3a80", new Object[]{this, error});
        } else {
            this.error = error;
        }
    }
}
