package tb;

import android.content.Context;
import com.airbnb.lottie.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/megadesign/anim/lottie/delegate/MAFontDelegate;", "Lcom/airbnb/lottie/FontAssetDelegate;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "context", "font", "", "getFont", "()Ljava/lang/String;", "setFont", "(Ljava/lang/String;)V", "fontDelegate", "Lcom/taobao/android/megadesign/anim/lottie/delegate/IFontDelegate;", "getFontDelegate", "()Lcom/taobao/android/megadesign/anim/lottie/delegate/IFontDelegate;", "setFontDelegate", "(Lcom/taobao/android/megadesign/anim/lottie/delegate/IFontDelegate;)V", "fetchFont", "Landroid/graphics/Typeface;", "fontFamily", "getFontPath", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class hss extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f28759a;
    private String b;
    private hsq c;

    public static /* synthetic */ Object ipc$super(hss hssVar, String str, Object... objArr) {
        if (str.hashCode() == 1628521357) {
            return super.b((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hss(Context ctx) {
        q.d(ctx, "ctx");
        this.f28759a = ctx;
    }

    public final void a(hsq hsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec95dc52", new Object[]{this, hsqVar});
        } else {
            this.c = hsqVar;
        }
    }

    @Override // com.airbnb.lottie.d
    public String b(String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        hsq hsqVar = this.c;
        return (hsqVar == null || (a2 = hsqVar.a(str)) == null) ? super.b(str) : a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return android.graphics.Typeface.createFromAsset(r4.f28759a.getAssets(), r4.b);
     */
    @Override // com.airbnb.lottie.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface a(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.hss.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "79ebd1a8"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            return r5
        L18:
            tb.hsq r0 = r4.c     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L21
            android.graphics.Typeface r0 = r0.b(r5)     // Catch: java.lang.Throwable -> L4d
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L25
            goto L5d
        L25:
            java.lang.String r0 = r4.b     // Catch: java.lang.Throwable -> L4d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L33
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L32
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 != 0) goto L42
            android.content.Context r5 = r4.f28759a     // Catch: java.lang.Throwable -> L4d
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r4.b     // Catch: java.lang.Throwable -> L4d
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r5, r0)     // Catch: java.lang.Throwable -> L4d
            goto L5d
        L42:
            android.content.Context r0 = r4.f28759a     // Catch: java.lang.Throwable -> L4d
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Throwable -> L4d
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r5)     // Catch: java.lang.Throwable -> L4d
            goto L5d
        L4d:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r2 = "MegaDesign"
            java.lang.String r3 = "LottieTypefaceCreateError"
            com.alibaba.mtl.appmonitor.AppMonitor.Counter.commit(r2, r3, r5, r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hss.a(java.lang.String):android.graphics.Typeface");
    }
}
