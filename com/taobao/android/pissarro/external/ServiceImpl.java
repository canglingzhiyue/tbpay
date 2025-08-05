package com.taobao.android.pissarro.external;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.ImageChoiceActivity;
import com.taobao.android.pissarro.PissarroShellActivity;
import com.taobao.android.pissarro.remote.RemoteLoadingActivity;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.icf;
import tb.kge;

/* loaded from: classes6.dex */
public class ServiceImpl implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f14657a;
    private a b;
    private ImageReceiver c = new ImageReceiver();

    static {
        kge.a(547806566);
        kge.a(1553100987);
    }

    @Override // com.taobao.android.pissarro.external.c
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c19de231", new Object[]{serviceImpl});
        } else {
            serviceImpl.a();
        }
    }

    public static /* synthetic */ a b(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("24b7ed61", new Object[]{serviceImpl}) : serviceImpl.b;
    }

    public static /* synthetic */ void c(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14468cb3", new Object[]{serviceImpl});
        } else {
            serviceImpl.b();
        }
    }

    public ServiceImpl(Context context) {
        this.f14657a = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(icf.BROADCAST_COMPLETE_ACTION);
        intentFilter.addAction(icf.BROADCAST_CANCEL_ACTION);
        intentFilter.addAction("action.taopai.load.fail");
        LocalBroadcastManager.getInstance(this.f14657a).registerReceiver(this.c, intentFilter);
    }

    @Override // com.taobao.android.pissarro.external.c
    public void openCamera(Config config, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c51357", new Object[]{this, config, aVar});
            return;
        }
        this.b = aVar;
        if (com.taobao.android.pissarro.remote.b.a()) {
            a(this.f14657a, config);
            return;
        }
        Intent intent = new Intent(this.f14657a, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 0);
        a(intent, this.f14657a);
        a(this.f14657a, config, intent);
    }

    @Override // com.taobao.android.pissarro.external.c
    public void openAlbum(Config config, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6197fbe1", new Object[]{this, config, aVar});
            return;
        }
        this.b = aVar;
        b(this.f14657a, config);
    }

    @Override // com.taobao.android.pissarro.external.c
    public void openCameraOrAlbum(Config config, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c008fe9", new Object[]{this, config, aVar});
            return;
        }
        this.b = aVar;
        Intent intent = new Intent(this.f14657a, ImageChoiceActivity.class);
        intent.putExtra("config", config);
        a(intent, this.f14657a);
        if (com.taobao.android.pissarro.remote.b.a()) {
            com.taobao.android.pissarro.c.a().a(config);
            this.f14657a.startActivity(intent);
            return;
        }
        a(this.f14657a, config, intent);
    }

    @Override // com.taobao.android.pissarro.external.c
    public void editPicture(Config config, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64af6dfc", new Object[]{this, config, str, aVar});
            return;
        }
        this.b = aVar;
        Intent intent = new Intent(this.f14657a, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 2);
        intent.putExtra(icf.KEY_IMAGE_PATH, str);
        intent.putExtra(icf.KEY_EDIT_PICTURE, true);
        a(intent, this.f14657a);
        Config m1010clone = config.m1010clone();
        if (m1010clone != null) {
            config = m1010clone;
        }
        config.setMultiple(true);
        if (com.taobao.android.pissarro.remote.b.a()) {
            com.taobao.android.pissarro.c.a().a(config);
            this.f14657a.startActivity(intent);
            return;
        }
        a(this.f14657a, config, intent);
    }

    public static void a(Context context, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b0a90", new Object[]{context, config});
            return;
        }
        Intent intent = new Intent(context, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 0);
        a(intent, context);
        if (!com.taobao.android.pissarro.remote.b.a()) {
            a(context, config, intent);
        } else {
            com.taobao.android.pissarro.c.a().a(config);
            context.startActivity(intent);
        }
        if (!(context instanceof Activity)) {
            return;
        }
        ((Activity) context).overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_fade_out);
    }

    public static void b(Context context, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42093551", new Object[]{context, config});
            return;
        }
        Intent intent = new Intent(context, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 1);
        a(intent, context);
        if (com.taobao.android.pissarro.remote.b.a()) {
            com.taobao.android.pissarro.c.a().a(config);
            context.startActivity(intent);
        } else {
            a(context, config, intent);
        }
        if (!(context instanceof Activity)) {
            return;
        }
        ((Activity) context).overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_fade_out);
    }

    @Override // com.taobao.android.pissarro.external.c
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.f14657a).unregisterReceiver(this.c);
        } catch (Exception unused) {
        }
        com.taobao.android.pissarro.c.a().a(false);
    }

    /* loaded from: classes6.dex */
    public class ImageReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1381460364);
        }

        public ImageReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            com.taobao.android.pissarro.c.a().a(false);
            if (icf.BROADCAST_CANCEL_ACTION.equals(action) || "action.taopai.load.fail".equals(action)) {
                ServiceImpl.a(ServiceImpl.this);
                if (ServiceImpl.b(ServiceImpl.this) == null) {
                    return;
                }
                ServiceImpl.b(ServiceImpl.this).onCancel();
            } else if (!icf.BROADCAST_COMPLETE_ACTION.equals(action)) {
            } else {
                ServiceImpl.c(ServiceImpl.this);
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(icf.KEY_IMAGE_RESULT);
                if (ServiceImpl.b(ServiceImpl.this) == null) {
                    return;
                }
                ServiceImpl.b(ServiceImpl.this).onComplete(parcelableArrayListExtra);
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.pissarro.c.a().c();
        new String[]{"spm-cnt=a21xm.9439189.0.0"};
        icf.a.a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.pissarro.c.a().c();
        String[] strArr = {"spm-cnt=a21xm.9439189.0.0", "option=" + icf.a.b()};
        icf.a.a();
    }

    private static void a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7efd343", new Object[]{intent, context});
        } else if (!(context instanceof Service) && !(context instanceof Application)) {
        } else {
            intent.addFlags(268435456);
        }
    }

    private static void a(Context context, Config config, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee03e24d", new Object[]{context, config, intent});
            return;
        }
        intent.putExtra("config", config);
        Intent intent2 = new Intent(context, RemoteLoadingActivity.class);
        intent2.putExtra("feature_name", com.taobao.appbundle.c.TAOPAI_FEATURE);
        intent2.putExtra("orignal_intent", intent);
        a(intent2, context);
        context.startActivity(intent2);
    }
}
