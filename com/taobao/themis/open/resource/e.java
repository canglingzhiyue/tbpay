package com.taobao.themis.open.resource;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.packages.parser.PackageParseUtils;
import com.taobao.themis.open.packages.parser.ParseContext;
import com.uc.webview.export.media.CommandID;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0017J\b\u0010\u0014\u001a\u00020\bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/open/resource/ResourcePackage;", "", "packageInfo", "Lcom/taobao/themis/open/resource/PackageInfo;", "(Lcom/taobao/themis/open/resource/PackageInfo;)V", "getPackageInfo", "()Lcom/taobao/themis/open/resource/PackageInfo;", "prepared", "", "preparedSuccess", "resourceMap", "", "", "Lcom/taobao/themis/open/resource/Resource;", "getResource", "name", CommandID.prepareAsync, "", "preparedCallback", "Lcom/taobao/themis/open/resource/ResourcePackage$ResourcePackagePreparedCallback;", "prepareSync", "ResourcePackagePreparedCallback", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ? extends c> f22721a;
    private volatile boolean b;
    private volatile boolean c;
    private final PackageInfo d;

    static {
        kge.a(-1118529274);
    }

    public e(PackageInfo packageInfo) {
        q.d(packageInfo, "packageInfo");
        this.d = packageInfo;
    }

    public final PackageInfo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PackageInfo) ipChange.ipc$dispatch("7daa8c18", new Object[]{this}) : this.d;
    }

    public boolean a() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            TMSLogger.d("ResourcePackage", "already prepared : " + this.c + " , " + this.d);
            return this.c;
        }
        this.b = true;
        if (this.d.c() == null) {
            TMSLogger.d("ResourcePackage", "file path is null, " + this.d);
            return false;
        }
        ParseContext parseContext = new ParseContext();
        parseContext.appId = this.d.a();
        parseContext.packagePath = this.d.c();
        parseContext.needVerify = false;
        try {
            Result.a aVar = Result.Companion;
            Map<String, c> mutableMap = PackageParseUtils.parsePackage(parseContext, true);
            q.b(mutableMap, "mutableMap");
            this.f22721a = ai.b(mutableMap);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            TMSLogger.b("ResourcePackage", String.valueOf(this.d), m2374exceptionOrNullimpl);
            return false;
        }
        this.c = true;
        return true;
    }

    public c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("54b3b2d2", new Object[]{this, str});
        }
        Map<String, ? extends c> map = this.f22721a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }
}
