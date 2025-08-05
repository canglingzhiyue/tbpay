package com.taobao.search.sf.widgets.list.floatbar;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes8.dex */
public final class a extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Serializable b;
    private boolean c;
    private final BroadcastReceiver d;

    static {
        kge.a(450629348);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -782893716:
                super.a((com.taobao.search.mmd.datasource.bean.a) objArr[0]);
                return null;
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void a(a aVar, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3d4d79", new Object[]{aVar, serializable});
        } else {
            aVar.b = serializable;
        }
    }

    @Override // com.taobao.search.sf.widgets.list.floatbar.k, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((com.taobao.search.mmd.datasource.bean.a) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity, ium parent, final com.taobao.search.sf.a model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        this.d = new BroadcastReceiver() { // from class: com.taobao.search.sf.widgets.list.floatbar.FeedbackPushButtonWidget$feedbackButtonOptionReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                q.c(context, "context");
                if (intent == null) {
                    return;
                }
                a aVar = a.this;
                Serializable serializableExtra = intent.getSerializableExtra("data");
                if (serializableExtra == null) {
                    serializableExtra = null;
                }
                a.a(aVar, serializableExtra);
                a.this.a().m = 1;
                a aVar2 = a.this;
                com.taobao.search.sf.datasource.c d = model.d();
                q.a((Object) d, "model.scopeDatasource");
                aVar2.a(d.getCurrentPage(), a.this.a());
            }
        };
    }

    private final Intent a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("540ed8a1", new Object[]{this, str});
        }
        Intent intent = new Intent("UCPTracker");
        intent.putExtra("errorCode", 0);
        intent.putExtra("errorMessage", "");
        intent.putExtra("group", "BackFlow");
        intent.putExtra("key", str);
        intent.putExtra("trackInfo", this.b);
        return intent;
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (this.c) {
                return;
            }
            this.c = true;
            LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.d, new IntentFilter("BHRNotificationName.Page_SearchItemList@right_float_window"));
        } else {
            this.c = false;
            LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.d);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.floatbar.k
    public void a(com.taobao.search.mmd.datasource.bean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d155fd6c", new Object[]{this, aVar});
            return;
        }
        super.a(aVar);
        a(new FeedbackPushButtonWidget$bindWithData$1(this));
        b(new FeedbackPushButtonWidget$bindWithData$2(this));
        a(true);
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        a(true);
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        a(false);
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        a(false);
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        a(false);
    }
}
