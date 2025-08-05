package com.taobao.message.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/activity/LoadingChatActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "enterH5", "", "isLoading", "navChat", "", "navH5Chat", "targetId", "", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "Companion", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class LoadingChatActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    public static final String H5_CHAT_URL = "https://market.m.taobao.com/app/tb-chatting/chat-universal-page/pages/index/index.html?targetId=";
    public static final String LOAD_CHAT_KEY = "originalUrl";
    public static final String LOAD_CHAT_URL = "http://tb.cn/n/im/dynamic/loading.html";
    public static final String SOURCE = "chat";
    public static final String TAG = "LoadingChatActivity";
    private HashMap _$_findViewCache;
    private boolean enterH5;
    private boolean isLoading;

    static {
        kge.a(-1790779266);
        Companion = new Companion(null);
    }

    public static /* synthetic */ Object ipc$super(LoadingChatActivity loadingChatActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    public static final /* synthetic */ void access$setEnterH5$p(LoadingChatActivity loadingChatActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80586487", new Object[]{loadingChatActivity, new Boolean(z)});
        } else {
            loadingChatActivity.enterH5 = z;
        }
    }

    public static final /* synthetic */ void access$setLoading$p(LoadingChatActivity loadingChatActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7bbafe", new Object[]{loadingChatActivity, new Boolean(z)});
        } else {
            loadingChatActivity.isLoading = z;
        }
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.String] */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        boolean isMsgBundleReady = BundleSplitUtil.INSTANCE.isMsgBundleReady();
        LoadingChatActivity loadingChatActivity = this;
        RemoteMonitorUtil.INSTANCE.directLoadAlarm4Source(loadingChatActivity, "chat", isMsgBundleReady);
        if (isMsgBundleReady) {
            navChat();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.isLoading = true;
        RemoteMonitorUtil.INSTANCE.remoteLoadCount("chat");
        View inflate = LayoutInflater.from(loadingChatActivity).inflate(R.layout.chat_loading_layout, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.rootFL);
        if (findViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(R.id.enter);
        if (findViewById2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById2;
        RemoteLoadingView remoteLoadingView = new RemoteLoadingView(loadingChatActivity, new LoadConfig.a().a("message").a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        viewGroup.addView(remoteLoadingView, 0, layoutParams);
        String stringExtra = getIntent().getStringExtra(LOAD_CHAT_KEY);
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("bizType");
        if (queryParameter == null) {
            queryParameter = getIntent().getStringExtra("bizType");
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Uri.parse(stringExtra).getQueryParameter("targetId");
        if (((String) objectRef.element) == null) {
            objectRef.element = getIntent().getStringExtra("targetId");
        }
        if (q.a((Object) "11001", (Object) queryParameter) && ((String) objectRef.element) != null) {
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.message.activity.LoadingChatActivity$onCreate$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        LoadingChatActivity.this.navH5Chat((String) objectRef.element);
                    }
                }
            });
        }
        setContentView(inflate);
        BundleSplitUtil.INSTANCE.checkMsgBundleReady("chat", 20, new LoadingChatActivity$onCreate$2(this, currentTimeMillis), LoadingChatActivity$onCreate$3.INSTANCE, true, new LoadingChatActivity$onCreate$4(remoteLoadingView));
    }

    public final void navChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b18e622", new Object[]{this});
            return;
        }
        Nav.from(this).toUri(getIntent().getStringExtra(LOAD_CHAT_KEY));
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (!this.isLoading) {
            return;
        }
        RemoteMonitorUtil.INSTANCE.remoteLoadBackCount("chat");
    }

    public final void navH5Chat(String targetId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244c959", new Object[]{this, targetId});
            return;
        }
        q.c(targetId, "targetId");
        this.enterH5 = true;
        Nav from = Nav.from(this);
        from.toUri(H5_CHAT_URL + targetId);
        finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/message/activity/LoadingChatActivity$Companion;", "", "()V", "H5_CHAT_URL", "", "LOAD_CHAT_KEY", "LOAD_CHAT_URL", "SOURCE", RPCDataItems.SWITCH_TAG_LOG, "message_base_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        static {
            kge.a(1296746054);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
