package com.taobao.phenix.decode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import tb.kge;
import tb.niw;
import tb.njb;
import tb.njc;
import tb.njd;
import tb.nmv;
import tb.nmx;

/* loaded from: classes.dex */
public class a extends nmx<njb, njd, com.taobao.phenix.request.b> implements com.taobao.rxm.request.b<com.taobao.phenix.request.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1370476149);
        kge.a(-1516804830);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nmy
    public boolean a(nmv<njb, com.taobao.phenix.request.b> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        return false;
    }

    public a() {
        super(0, 1);
    }

    private njd a(njd njdVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (njd) ipChange.ipc$dispatch("d03d37ae", new Object[]{this, njdVar});
        }
        b o = com.taobao.phenix.intf.b.h().o();
        if (o == null) {
            return njdVar;
        }
        njc inspectEncodedData = o.inspectEncodedData(njdVar.c, njdVar);
        if (inspectEncodedData != null && inspectEncodedData.a()) {
            z = true;
        }
        com.taobao.tcommon.core.b.a(z, "inspected data cannot be null or not available!");
        return inspectEncodedData == njdVar ? njdVar : njdVar.a(inspectEncodedData, njdVar.f).b(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02be A[Catch: Throwable -> 0x0351, UnsatisfiedLinkError -> 0x0353, OutOfMemoryError -> 0x0355, all -> 0x0363, TRY_LEAVE, TryCatch #0 {all -> 0x0363, blocks: (B:12:0x0063, B:14:0x0067, B:22:0x0081, B:26:0x00a7, B:28:0x00ad, B:36:0x00ce, B:38:0x00db, B:39:0x00e6, B:43:0x00f3, B:46:0x00f9, B:47:0x011c, B:49:0x0120, B:81:0x01f0, B:83:0x01f8, B:90:0x0210, B:92:0x0223, B:94:0x022f, B:98:0x0238, B:100:0x024b, B:102:0x0251, B:104:0x025b, B:122:0x02be, B:120:0x02b7, B:54:0x0130, B:56:0x013c, B:60:0x0146, B:62:0x019b, B:64:0x01a0, B:66:0x01a9, B:67:0x01ae, B:69:0x01b2, B:71:0x01b8, B:73:0x01c6, B:75:0x01cb, B:76:0x01d1, B:80:0x01eb, B:30:0x00b9, B:33:0x00c1, B:35:0x00c9), top: B:232:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x040c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0418 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x041f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x030c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0 A[Catch: Throwable -> 0x0357, UnsatisfiedLinkError -> 0x035b, OutOfMemoryError -> 0x035f, all -> 0x0363, TryCatch #0 {all -> 0x0363, blocks: (B:12:0x0063, B:14:0x0067, B:22:0x0081, B:26:0x00a7, B:28:0x00ad, B:36:0x00ce, B:38:0x00db, B:39:0x00e6, B:43:0x00f3, B:46:0x00f9, B:47:0x011c, B:49:0x0120, B:81:0x01f0, B:83:0x01f8, B:90:0x0210, B:92:0x0223, B:94:0x022f, B:98:0x0238, B:100:0x024b, B:102:0x0251, B:104:0x025b, B:122:0x02be, B:120:0x02b7, B:54:0x0130, B:56:0x013c, B:60:0x0146, B:62:0x019b, B:64:0x01a0, B:66:0x01a9, B:67:0x01ae, B:69:0x01b2, B:71:0x01b8, B:73:0x01c6, B:75:0x01cb, B:76:0x01d1, B:80:0x01eb, B:30:0x00b9, B:33:0x00c1, B:35:0x00c9), top: B:232:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a9 A[Catch: Throwable -> 0x0357, UnsatisfiedLinkError -> 0x035b, OutOfMemoryError -> 0x035f, all -> 0x0363, TryCatch #0 {all -> 0x0363, blocks: (B:12:0x0063, B:14:0x0067, B:22:0x0081, B:26:0x00a7, B:28:0x00ad, B:36:0x00ce, B:38:0x00db, B:39:0x00e6, B:43:0x00f3, B:46:0x00f9, B:47:0x011c, B:49:0x0120, B:81:0x01f0, B:83:0x01f8, B:90:0x0210, B:92:0x0223, B:94:0x022f, B:98:0x0238, B:100:0x024b, B:102:0x0251, B:104:0x025b, B:122:0x02be, B:120:0x02b7, B:54:0x0130, B:56:0x013c, B:60:0x0146, B:62:0x019b, B:64:0x01a0, B:66:0x01a9, B:67:0x01ae, B:69:0x01b2, B:71:0x01b8, B:73:0x01c6, B:75:0x01cb, B:76:0x01d1, B:80:0x01eb, B:30:0x00b9, B:33:0x00c1, B:35:0x00c9), top: B:232:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb A[Catch: Throwable -> 0x0357, UnsatisfiedLinkError -> 0x035b, OutOfMemoryError -> 0x035f, all -> 0x0363, TryCatch #0 {all -> 0x0363, blocks: (B:12:0x0063, B:14:0x0067, B:22:0x0081, B:26:0x00a7, B:28:0x00ad, B:36:0x00ce, B:38:0x00db, B:39:0x00e6, B:43:0x00f3, B:46:0x00f9, B:47:0x011c, B:49:0x0120, B:81:0x01f0, B:83:0x01f8, B:90:0x0210, B:92:0x0223, B:94:0x022f, B:98:0x0238, B:100:0x024b, B:102:0x0251, B:104:0x025b, B:122:0x02be, B:120:0x02b7, B:54:0x0130, B:56:0x013c, B:60:0x0146, B:62:0x019b, B:64:0x01a0, B:66:0x01a9, B:67:0x01ae, B:69:0x01b2, B:71:0x01b8, B:73:0x01c6, B:75:0x01cb, B:76:0x01d1, B:80:0x01eb, B:30:0x00b9, B:33:0x00c1, B:35:0x00c9), top: B:232:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f8 A[Catch: Throwable -> 0x0357, UnsatisfiedLinkError -> 0x035b, OutOfMemoryError -> 0x035f, all -> 0x0363, TRY_LEAVE, TryCatch #0 {all -> 0x0363, blocks: (B:12:0x0063, B:14:0x0067, B:22:0x0081, B:26:0x00a7, B:28:0x00ad, B:36:0x00ce, B:38:0x00db, B:39:0x00e6, B:43:0x00f3, B:46:0x00f9, B:47:0x011c, B:49:0x0120, B:81:0x01f0, B:83:0x01f8, B:90:0x0210, B:92:0x0223, B:94:0x022f, B:98:0x0238, B:100:0x024b, B:102:0x0251, B:104:0x025b, B:122:0x02be, B:120:0x02b7, B:54:0x0130, B:56:0x013c, B:60:0x0146, B:62:0x019b, B:64:0x01a0, B:66:0x01a9, B:67:0x01ae, B:69:0x01b2, B:71:0x01b8, B:73:0x01c6, B:75:0x01cb, B:76:0x01d1, B:80:0x01eb, B:30:0x00b9, B:33:0x00c1, B:35:0x00c9), top: B:232:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210 A[Catch: Throwable -> 0x0357, UnsatisfiedLinkError -> 0x035b, OutOfMemoryError -> 0x035f, all -> 0x0363, TRY_ENTER, TryCatch #0 {all -> 0x0363, blocks: (B:12:0x0063, B:14:0x0067, B:22:0x0081, B:26:0x00a7, B:28:0x00ad, B:36:0x00ce, B:38:0x00db, B:39:0x00e6, B:43:0x00f3, B:46:0x00f9, B:47:0x011c, B:49:0x0120, B:81:0x01f0, B:83:0x01f8, B:90:0x0210, B:92:0x0223, B:94:0x022f, B:98:0x0238, B:100:0x024b, B:102:0x0251, B:104:0x025b, B:122:0x02be, B:120:0x02b7, B:54:0x0130, B:56:0x013c, B:60:0x0146, B:62:0x019b, B:64:0x01a0, B:66:0x01a9, B:67:0x01ae, B:69:0x01b2, B:71:0x01b8, B:73:0x01c6, B:75:0x01cb, B:76:0x01d1, B:80:0x01eb, B:30:0x00b9, B:33:0x00c1, B:35:0x00c9), top: B:232:0x0063 }] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v30, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r11v31, types: [com.taobao.pexode.entity.b] */
    /* JADX WARN: Type inference failed for: r11v32, types: [com.taobao.pexode.entity.b] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [tb.njd] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // tb.nmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.nmv<tb.njb, com.taobao.phenix.request.b> r26, boolean r27, tb.njd r28) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.decode.a.a(tb.nmv, boolean, tb.njd):void");
    }

    @Override // com.taobao.rxm.request.b
    public void a(com.taobao.phenix.request.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71690dc3", new Object[]{this, bVar});
            return;
        }
        niw.a("Phenix", "Decode Cancel.", bVar);
        PexodeOptions D = bVar.D();
        if (D == null) {
            return;
        }
        bVar.a((PexodeOptions) null);
        niw.a("Decoder", bVar, "cancelled image decoding, result=%b", Boolean.valueOf(D.requestCancel()));
    }

    private void a(nmv<njb, com.taobao.phenix.request.b> nmvVar, boolean z, njd njdVar, DecodeException decodeException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a99df53e", new Object[]{this, nmvVar, new Boolean(z), njdVar, decodeException});
        } else if (z) {
            decodeException.setLocalUri(nmvVar.e().y().h());
            Throwable th = decodeException;
            if (njdVar != null) {
                decodeException.dataFromDisk(njdVar.e);
                th = decodeException;
                if (!njdVar.e) {
                    th = decodeException;
                    if (!njdVar.f31496a) {
                        th = decodeException;
                        if (njdVar.a()) {
                            niw.c("Decoder", nmvVar.e(), "actual decode error=%s, convert to error=IncompleteContentError", decodeException);
                            th = new IncompleteResponseException();
                        }
                    }
                }
            }
            nmvVar.b(th);
        } else {
            niw.d("Decoder", nmvVar.e(), "intermediate result decode error=%s, request not failed yet", decodeException);
        }
    }
}
