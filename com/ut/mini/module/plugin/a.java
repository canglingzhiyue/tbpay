package com.ut.mini.module.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsOldPlugin = true;
    private boolean mIsSyncMessage = true;
    private List<String> mWritableKeyList = null;
    private List<String> mUtparamCntList = null;

    static {
        kge.a(-163263487);
    }

    public abstract int[] getAttentionEventIds();

    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : "";
    }

    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("63572670", new Object[]{this, str, new Integer(i), str2, str3, str4});
        }
        return null;
    }

    public boolean isSyncMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f37708ed", new Object[]{this})).booleanValue() : this.mIsSyncMessage;
    }

    public void setUTPluginParam(boolean z, boolean z2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898fb242", new Object[]{this, new Boolean(z), new Boolean(z2), list, list2});
            return;
        }
        this.mIsOldPlugin = z;
        this.mIsSyncMessage = z2;
        if (list == null) {
            this.mWritableKeyList = null;
        } else {
            this.mWritableKeyList = new ArrayList(list);
        }
        if (list2 == null) {
            this.mUtparamCntList = null;
        } else {
            this.mUtparamCntList = new ArrayList(list2);
        }
    }

    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map}) : onEventDispatch(str, i, str2, str3, str4);
    }

    public static boolean isEventIDInRange(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8acb9345", new Object[]{iArr, new Integer(i)})).booleanValue();
        }
        if (iArr != null) {
            if (iArr[0] == -1) {
                return true;
            }
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWritableKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("befcd7ea", new Object[]{this, str})).booleanValue();
        }
        if (this.mIsOldPlugin) {
            return true;
        }
        List<String> list = this.mWritableKeyList;
        if (list == null) {
            return false;
        }
        if (!list.contains("*")) {
            return this.mWritableKeyList.contains(str);
        }
        return true;
    }

    public boolean isWritableUtparamCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8baac9a", new Object[]{this, str})).booleanValue();
        }
        if (this.mIsOldPlugin) {
            return true;
        }
        List<String> list = this.mUtparamCntList;
        if (list == null) {
            return false;
        }
        if (!list.contains("*")) {
            return this.mUtparamCntList.contains(str);
        }
        return true;
    }
}
