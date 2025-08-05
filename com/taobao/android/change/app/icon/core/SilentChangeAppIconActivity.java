package com.taobao.android.change.app.icon.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.user.mobile.utils.ImageUtil;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.android.change.app.icon.utils.g;
import com.taobao.android.change.app.icon.utils.h;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.lang.ref.WeakReference;
import tb.igb;
import tb.kge;

/* loaded from: classes4.dex */
public class SilentChangeAppIconActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HANDLER_MSG_CHANGE_APP_ICON_ON_RESULT = 1;
    public static final String KEY_CHANGE_APP_ICON_DATA = "key_change_app_icon_data";
    public static final String TAG = "SilentChangeAppIcon";

    /* renamed from: a */
    private a f9316a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private Runnable e;

    static {
        kge.a(-319827888);
    }

    public static /* synthetic */ Object ipc$super(SilentChangeAppIconActivity silentChangeAppIconActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void lambda$wOVMizLuEYGLPCnCt04SqLKgltY(SilentChangeAppIconActivity silentChangeAppIconActivity) {
        silentChangeAppIconActivity.a();
    }

    /* renamed from: lambda$xP3uRE6KKbCrOmQn8d6aYFD-aJo */
    public static /* synthetic */ void m837lambda$xP3uRE6KKbCrOmQn8d6aYFDaJo(SilentChangeAppIconActivity silentChangeAppIconActivity, View view) {
        silentChangeAppIconActivity.a(view);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ TextView a(SilentChangeAppIconActivity silentChangeAppIconActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c4b9aefd", new Object[]{silentChangeAppIconActivity}) : silentChangeAppIconActivity.b;
    }

    public static /* synthetic */ void a(SilentChangeAppIconActivity silentChangeAppIconActivity, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99ba7d9", new Object[]{silentChangeAppIconActivity, new Long(j), new Boolean(z)});
        } else {
            silentChangeAppIconActivity.a(j, z);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        setContentView(R.layout.activity_change_app_icon);
        try {
            this.f9316a = new a(this);
            this.b = (TextView) findViewById(R.id.view_change_app_icon_tips);
            this.b.setText(R.string.str_change_app_icon_tips);
            this.c = (TextView) findViewById(R.id.view_change_app_icon_close);
            this.d = (ImageView) findViewById(R.id.view_change_app_icon_image);
            ImageUtil.updateImage(this.d, "https://gw.alicdn.com/imgextra/i4/O1CN0129uWJi21ikvBb1Jo4_!!6000000007019-2-tps-270-218.png");
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.change.app.icon.core.-$$Lambda$SilentChangeAppIconActivity$xP3uRE6KKbCrOmQn8d6aYFD-aJo
                {
                    SilentChangeAppIconActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SilentChangeAppIconActivity.m837lambda$xP3uRE6KKbCrOmQn8d6aYFDaJo(SilentChangeAppIconActivity.this, view);
                }
            });
            AdapterForTLog.loge(TAG, "onCreate getTaskId:" + getTaskId());
            intent = getIntent();
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "onCreate changeAppIcon error:" + e.getMessage(), e);
            g.a(g.PAGE_NAME, "silent_act", "changeAppIcon error", e.getMessage(), null);
        }
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra(KEY_CHANGE_APP_ICON_DATA);
        g.a(g.PAGE_NAME, "silent_act", "create", stringExtra, null);
        b.a().a((ChangeAppIconJSModel) h.a(stringExtra, ChangeAppIconJSModel.class), new igb() { // from class: com.taobao.android.change.app.icon.core.SilentChangeAppIconActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                SilentChangeAppIconActivity.this = this;
            }

            @Override // tb.igb
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "progress:" + i);
            }

            @Override // tb.igb
            public void a(Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b668f6c", new Object[]{this, bundle2});
                    return;
                }
                boolean z = bundle2.getBoolean("result");
                boolean z2 = bundle2.getBoolean(Constrant.KEY_MORE_ICONS);
                boolean z3 = bundle2.getBoolean(Constrant.KEY_TIME_OUT);
                AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "onResult result:" + z + " moreIcons:" + z2 + " timeOut:" + z3);
                StringBuilder sb = new StringBuilder();
                sb.append("data:");
                sb.append(bundle2.toString());
                String sb2 = sb.toString();
                g.c(g.PAGE_NAME, "silent_act", sb2, "result:" + z, null);
                SilentChangeAppIconActivity.a(SilentChangeAppIconActivity.this).setText(R.string.str_change_app_icon_success);
                long a2 = com.taobao.android.change.app.icon.utils.c.a(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_ICON_ACT_DELAY_FINISH_TIME_MS, 1000L);
                AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "act_delay_finish_ms:" + a2);
                SilentChangeAppIconActivity.a(SilentChangeAppIconActivity.this, a2, false);
            }
        });
        long a2 = com.taobao.android.change.app.icon.utils.c.a(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_ICON_ACT_DELAY_FORCE_FINISH_TIME_MS, 3000L);
        AdapterForTLog.loge(TAG, "act_delay_force_finish_ms:" + a2);
        a(a2, true);
        this.e = new Runnable() { // from class: com.taobao.android.change.app.icon.core.-$$Lambda$SilentChangeAppIconActivity$wOVMizLuEYGLPCnCt04SqLKgltY
            {
                SilentChangeAppIconActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SilentChangeAppIconActivity.lambda$wOVMizLuEYGLPCnCt04SqLKgltY(SilentChangeAppIconActivity.this);
            }
        };
        this.c.postDelayed(this.e, a2);
    }

    public /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        g.b(g.PAGE_NAME, "silent_act", "active finish", null, null);
        finish();
    }

    public /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.setVisibility(0);
        }
    }

    private void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        AdapterForTLog.loge(TAG, "sendDelayFinish finishDelayMs:" + j + " force:" + z);
        Message message = new Message();
        message.what = 1;
        message.obj = Boolean.valueOf(z);
        this.f9316a.sendMessageDelayed(message, j);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        g.b(g.PAGE_NAME, "silent_act", "back finish", null, null);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        overridePendingTransition(0, 0);
        AdapterForTLog.loge(TAG, "real finish getTaskId:" + getTaskId());
        super.finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c.removeCallbacks(this.e);
        this.f9316a.removeCallbacksAndMessages(null);
    }

    /* loaded from: classes4.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public WeakReference<SilentChangeAppIconActivity> f9318a;

        static {
            kge.a(-1807522808);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(SilentChangeAppIconActivity silentChangeAppIconActivity) {
            super(Looper.getMainLooper());
            this.f9318a = new WeakReference<>(silentChangeAppIconActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            SilentChangeAppIconActivity silentChangeAppIconActivity = this.f9318a.get();
            if (silentChangeAppIconActivity == null) {
                AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "handle act is null");
                g.a(g.PAGE_NAME, "silent_act", "handle act is null", "act is null", null);
            } else if (message.what != 1) {
            } else {
                try {
                    z = ((Boolean) message.obj).booleanValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "handle forceFinish:" + z);
                g.a(g.PAGE_NAME, "silent_act", "handle success", "forceFinish:" + z, null);
                silentChangeAppIconActivity.finish();
            }
        }
    }
}
