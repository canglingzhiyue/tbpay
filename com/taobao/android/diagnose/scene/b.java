package com.taobao.android.diagnose.scene;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Context f11717a;
    private a c = null;
    private AtomicBoolean d = new AtomicBoolean(false);
    private BroadcastReceiver b = new BroadcastReceiver() { // from class: com.taobao.android.diagnose.scene.SceneObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (b.a(b.this) == null || intent == null || !"com.taobao.pink.feedback.action.screenshot".equals(intent.getAction())) {
            } else {
                b.a(b.this, intent);
            }
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void onScreenShot(Uri uri, String str);
    }

    static {
        kge.a(-1704008287);
    }

    public static /* synthetic */ a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d76baeeb", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void a(b bVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590a8ed5", new Object[]{bVar, intent});
        } else {
            bVar.a(intent);
        }
    }

    public b(Context context) {
        this.f11717a = context;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a2613b", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        if (this.d.getAndSet(true)) {
            return;
        }
        v.a("SceneObserver", "register screenshot");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.pink.feedback.action.screenshot");
        LocalBroadcastManager.getInstance(this.f11717a).registerReceiver(this.b, intentFilter);
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        v.a("SceneObserver", "onScreenShot");
        String stringExtra = intent.getStringExtra("filePath");
        Uri uri = (Uri) intent.getParcelableExtra("uri");
        if (uri == null || StringUtils.isEmpty(stringExtra)) {
            return;
        }
        this.c.onScreenShot(uri, stringExtra);
    }
}
