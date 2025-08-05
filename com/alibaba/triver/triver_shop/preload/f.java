package com.alibaba.triver.triver_shop.preload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.triver.triver_shop.newShop.ShopActivity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Long, a> f4029a;

    /* loaded from: classes3.dex */
    public interface a {
        Intent a();

        void a(Intent intent);

        void b(Intent intent);
    }

    private f() {
    }

    static {
        kge.a(168932069);
        INSTANCE = new f();
        f4029a = new HashMap<>();
    }

    public final Intent a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("92509e37", new Object[]{this, new Long(j)});
        }
        a remove = f4029a.remove(Long.valueOf(j));
        if (remove != null) {
            return remove.a();
        }
        return null;
    }

    public final void a(long j, a shopPrePushAcDataGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939c0eb6", new Object[]{this, new Long(j), shopPrePushAcDataGetter});
            return;
        }
        q.d(shopPrePushAcDataGetter, "shopPrePushAcDataGetter");
        f4029a.put(Long.valueOf(j), shopPrePushAcDataGetter);
    }

    public final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            f4029a.remove(Long.valueOf(j));
        }
    }

    public final void a(Context context, long j, String shopUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8177772e", new Object[]{this, context, new Long(j), shopUrl});
            return;
        }
        q.d(context, "context");
        q.d(shopUrl, "shopUrl");
        Intent intent = new Intent();
        intent.putExtra(RVConstants.EXTRA_START_TOKEN, j);
        intent.putExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
        intent.putExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_FIRST_IN_SHOP_URL, shopUrl);
        intent.setClass(context, ShopActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static /* synthetic */ void a(f fVar, Intent intent, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c837b6e7", new Object[]{fVar, intent, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        fVar.a(intent, z);
    }

    public final void a(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864fb4f", new Object[]{this, intent, new Boolean(z)});
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = z;
        String str = null;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (intent != null) {
            str = intent.getStringExtra("targetUrl");
        }
        long j = extras == null ? 0L : extras.getLong(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_START, 0L);
        if (j == 0) {
            booleanRef.element = false;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            booleanRef.element = false;
        }
        Intent intent2 = new Intent();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (str != null) {
            intent2.setData(Uri.parse(str));
        }
        intent2.putExtra(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
        a remove = f4029a.remove(Long.valueOf(j));
        if (remove != null) {
            if (booleanRef.element) {
                remove.a(intent2);
                return;
            } else {
                remove.b(intent2);
                return;
            }
        }
        f4029a.put(Long.valueOf(j), new b(intent2, booleanRef));
    }

    /* loaded from: classes3.dex */
    public static final class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f4030a;
        public final /* synthetic */ Ref.BooleanRef b;

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            } else {
                q.d(intent, "intent");
            }
        }

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public void b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            } else {
                q.d(intent, "intent");
            }
        }

        public b(Intent intent, Ref.BooleanRef booleanRef) {
            this.f4030a = intent;
            this.b = booleanRef;
        }

        @Override // com.alibaba.triver.triver_shop.preload.f.a
        public Intent a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this}) : this.f4030a;
        }
    }
}
