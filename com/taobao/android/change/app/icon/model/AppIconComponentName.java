package com.taobao.android.change.app.icon.model;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.utils.d;
import tb.kge;

/* loaded from: classes4.dex */
public class AppIconComponentName {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String clzPath;
    public String iconName;
    public int state = -1;
    public int iconResId = -1;

    static {
        kge.a(-575264784);
    }

    public static AppIconComponentName create(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppIconComponentName) ipChange.ipc$dispatch("e4c8d23a", new Object[]{context, str, str2}) : create(context, str, str2, -1);
    }

    public static AppIconComponentName create(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppIconComponentName) ipChange.ipc$dispatch("3db142b", new Object[]{context, str, str2, new Integer(i)});
        }
        AppIconComponentName appIconComponentName = new AppIconComponentName();
        appIconComponentName.iconName = str;
        appIconComponentName.clzPath = str2;
        appIconComponentName.iconResId = i;
        d.b(context, appIconComponentName);
        return appIconComponentName;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AppIconComponentName{iconName='" + this.iconName + "', clzPath='" + this.clzPath + "', state=" + this.state + ", iconResId=" + this.iconResId + '}';
    }
}
