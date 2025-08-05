package com.taobao.tbpoplayer;

import android.app.Activity;
import android.app.ActivityGroup;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.adapter.b;
import com.taobao.tbpoplayer.adapter.f;
import com.taobao.tbpoplayer.adapter.g;
import com.taobao.tbpoplayer.adapter.i;
import com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager;
import com.taobao.tbpoplayer.filter.a;
import tb.kge;

/* loaded from: classes.dex */
public class c extends PopLayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1957374044);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1605354164) {
            super.onPageClean((Activity) objArr[0]);
            return null;
        } else if (hashCode != 1648504632) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSwitchedNewPage((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    @Override // com.alibaba.poplayer.PopLayer
    public boolean isValidConfigBeforeMonitor(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb0152c", new Object[]{this, baseConfigItem})).booleanValue();
        }
        return true;
    }

    public c() {
        super(new g(), new f("android_poplayer"), new i(), b.a());
    }

    @Override // com.alibaba.poplayer.PopLayer
    public Pair<Boolean, String> isValidConfigWithReason(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("19e79c7f", new Object[]{this, dVar}) : a.a(dVar);
    }

    @Override // com.alibaba.poplayer.PopLayer
    public boolean isValidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b37f77e", new Object[]{this, activity})).booleanValue();
        }
        if (activity != null) {
            String name = activity.getClass().getName();
            for (String str : com.taobao.tbpoplayer.info.a.a().d()) {
                if (str.equals(name)) {
                    return false;
                }
            }
        }
        return !(activity instanceof ActivityGroup);
    }

    @Override // com.alibaba.poplayer.PopLayer
    public void onPageClean(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fafc2b4", new Object[]{this, activity});
            return;
        }
        super.onPageClean(activity);
        com.taobao.tbpoplayer.view.a.a().a(InternalTriggerController.a(activity));
    }

    @Override // com.alibaba.poplayer.PopLayer
    public void onSwitchedNewPage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62422f38", new Object[]{this, str, str2});
            return;
        }
        super.onSwitchedNewPage(str, str2);
        if (TextUtils.isEmpty(str) || str.equals(str2)) {
            return;
        }
        MtopGroupPreCheckManager.a().a(str);
    }
}
