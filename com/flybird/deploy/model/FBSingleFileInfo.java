package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class FBSingleFileInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f7217a;
    public SpecialFileType b;

    /* loaded from: classes4.dex */
    public enum SpecialFileType {
        PLAIN,
        APP_MANIFEST
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBSingleFileInfo{name='" + this.f7217a + "', fileType=" + this.b + '}';
    }
}
