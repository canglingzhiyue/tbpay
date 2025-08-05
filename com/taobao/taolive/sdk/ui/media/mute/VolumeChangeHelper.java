package com.taobao.taolive.sdk.ui.media.mute;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class VolumeChangeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final String VOLUME_CHANGE_ACTION = "android.media.VOLUME_CHANGED_ACTION";

    /* renamed from: a  reason: collision with root package name */
    private Context f21940a;
    private VolumeBroadCastReceiver b;
    private a c;
    private AudioManager d;

    /* loaded from: classes8.dex */
    public interface a {
        void e();
    }

    static {
        kge.a(-670982415);
    }

    public static /* synthetic */ AudioManager a(VolumeChangeHelper volumeChangeHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioManager) ipChange.ipc$dispatch("bf54edfb", new Object[]{volumeChangeHelper}) : volumeChangeHelper.d;
    }

    public static /* synthetic */ a b(VolumeChangeHelper volumeChangeHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("53fc58aa", new Object[]{volumeChangeHelper}) : volumeChangeHelper.c;
    }

    public VolumeChangeHelper() {
        if (pmd.a().u() != null && pmd.a().u().c() != null) {
            this.f21940a = pmd.a().u().c();
        }
        this.d = (AudioManager) this.f21940a.getSystemService("audio");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f2aaeb", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        this.b = new VolumeBroadCastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        VolumeBroadCastReceiver volumeBroadCastReceiver = this.b;
        if (volumeBroadCastReceiver == null) {
            return;
        }
        this.f21940a.registerReceiver(volumeBroadCastReceiver, intentFilter);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        AudioManager audioManager = this.d;
        if (audioManager == null) {
            return;
        }
        audioManager.setStreamVolume(3, i, 0);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        AudioManager audioManager = this.d;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamVolume(3);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        AudioManager audioManager = this.d;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamMaxVolume(3);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        VolumeBroadCastReceiver volumeBroadCastReceiver = this.b;
        if (volumeBroadCastReceiver == null) {
            return;
        }
        this.f21940a.unregisterReceiver(volumeBroadCastReceiver);
        this.b = null;
    }

    /* loaded from: classes8.dex */
    public class VolumeBroadCastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2040695517);
        }

        public VolumeBroadCastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3) {
            } else {
                int streamVolume = VolumeChangeHelper.a(VolumeChangeHelper.this).getStreamVolume(3);
                VolumeChangeHelper.b(VolumeChangeHelper.this).e();
                if (streamVolume != 0) {
                    return;
                }
                VolumeChangeHelper.b(VolumeChangeHelper.this);
            }
        }
    }
}
