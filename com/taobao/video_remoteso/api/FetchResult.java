package com.taobao.video_remoteso.api;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class FetchResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mLibName;
    private String mLibPath;
    private String mMajorVersion;
    private String mMinorVersion;

    static {
        kge.a(-1919493588);
    }

    public RSoException getException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("c350a0f9", new Object[]{this});
        }
        return null;
    }

    public FetchResult(String str, String str2) {
        this.mLibName = str;
        this.mLibPath = str2;
    }

    public void setVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9609a31", new Object[]{this, str, str2});
            return;
        }
        this.mMajorVersion = str;
        this.mMinorVersion = str2;
    }

    public boolean isLoadSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f4973be", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.mLibName) && !TextUtils.isEmpty(this.mLibPath);
    }

    public String getLibName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this}) : this.mLibName;
    }

    public String getLibPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3435765", new Object[]{this}) : this.mLibPath;
    }

    public String getLibFullPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1702316", new Object[]{this}) : this.mLibPath;
    }

    public String getMajorVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ced26c4", new Object[]{this}) : this.mMajorVersion;
    }

    public String getMinorVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("321246c0", new Object[]{this}) : this.mMinorVersion;
    }
}
