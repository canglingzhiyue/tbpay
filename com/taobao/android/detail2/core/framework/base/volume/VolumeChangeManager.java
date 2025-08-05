package com.taobao.android.detail2.core.framework.base.volume;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class VolumeChangeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f11479a;
    private VolumeChangedBroadcastReceiver b;
    private List<a> c;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2);
    }

    static {
        kge.a(1624140332);
    }

    public static /* synthetic */ List a(VolumeChangeManager volumeChangeManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("68cb613a", new Object[]{volumeChangeManager}) : volumeChangeManager.c;
    }

    public VolumeChangeManager(b bVar) {
        this.f11479a = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        this.b = new VolumeChangedBroadcastReceiver();
        b bVar2 = this.f11479a;
        if (bVar2 == null || bVar2.g() == null) {
            return;
        }
        this.f11479a.g().registerReceiver(this.b, intentFilter);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4131a50", new Object[]{this, aVar});
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (aVar == null || this.c.contains(aVar)) {
            return;
        }
        this.c.add(aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b bVar = this.f11479a;
        if (bVar != null && bVar.g() != null && this.b != null) {
            this.f11479a.g().unregisterReceiver(this.b);
        }
        this.c = null;
    }

    /* loaded from: classes5.dex */
    public class VolumeChangedBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-356129714);
        }

        private VolumeChangedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TextUtils.equals(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1);
                if (VolumeChangeManager.a(VolumeChangeManager.this) == null) {
                    return;
                }
                for (a aVar : VolumeChangeManager.a(VolumeChangeManager.this)) {
                    if (aVar != null) {
                        aVar.a(intExtra, intExtra2);
                    }
                }
            }
        }
    }
}
