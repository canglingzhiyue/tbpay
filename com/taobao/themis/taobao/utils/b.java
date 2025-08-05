package com.taobao.themis.taobao.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.nav.Nav;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;
import tb.qpv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/taobao/themis/taobao/utils/TMSNavProcessUtils;", "", "()V", "getEnableAfcColdMode", "", "isAfcColdMode", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "switchForPhaApp", "context", "Landroid/content/Context;", "originUri", "Landroid/net/Uri;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22864a;
        public final /* synthetic */ Uri b;

        public a(String str, Uri uri) {
            this.f22864a = str;
            this.b = uri;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f22864a;
            String uri = this.b.toString();
            q.b(uri, "originUri.toString()");
            qpv.c(str, uri);
        }
    }

    static {
        kge.a(1804924404);
        INSTANCE = new b();
    }

    private b() {
    }

    @JvmStatic
    public static final boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (INSTANCE.a()) {
            return com.taobao.android.launcher.bootstrap.tao.ability.b.d(intent);
        }
        return false;
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IConfigAdapter iConfigAdapter = (IConfigAdapter) qpt.b(IConfigAdapter.class);
        return q.a((Object) (iConfigAdapter != null ? iConfigAdapter.getConfigByGroupAndNameFromLocal(i.GROUP_ARIVER_COMMON_CONFIG, "enableAfcColdMode", "true") : null), (Object) "true");
    }

    public final boolean a(Context context, Uri originUri) {
        String queryParameter;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd717ceb", new Object[]{this, context, originUri})).booleanValue();
        }
        q.d(context, "context");
        q.d(originUri, "originUri");
        if (!t.a(context, originUri.toString()) || (queryParameter = originUri.getQueryParameter(i.APP_ID)) == null) {
            return false;
        }
        q.b(queryParameter, "originUri.getQueryParame…s.APP_ID) ?: return false");
        String i = n.i(queryParameter);
        if (!(!kotlin.text.n.a((CharSequence) i))) {
            i = null;
        }
        if (i == null) {
            return false;
        }
        Uri convertUri = Uri.parse(i);
        Uri.Builder buildUpon = convertUri.buildUpon();
        Set<String> queryParameterNames = originUri.getQueryParameterNames();
        q.b(queryParameterNames, "originUri.queryParameterNames");
        for (String str : queryParameterNames) {
            if (!q.a((Object) "pha_manifest", (Object) str) && !q.a((Object) i.APP_ID, (Object) str) && (!q.a((Object) com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA, (Object) str) || !q.a((Object) "true", (Object) originUri.getQueryParameter(str)))) {
                q.b(convertUri, "convertUri");
                if (!convertUri.getQueryParameterNames().contains(str)) {
                    buildUpon.appendQueryParameter(str, originUri.getQueryParameter(str));
                }
            }
        }
        Nav.from(context).skipPreprocess().disableTransition().disallowLoopback().toUri(buildUpon.build().toString());
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) != null) {
            executor.execute(new a(queryParameter, originUri));
        }
        return true;
    }
}
