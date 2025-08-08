package com.uc.webview.internal.stats;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24009a = "k";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        final StringBuilder f24010a = new StringBuilder();

        public a(String str) {
            StringBuilder sb = this.f24010a;
            sb.append("lt=");
            sb.append(str);
            sb.append("`");
        }

        public final a a() {
            this.f24010a.append("\n");
            return this;
        }

        public final a a(String str, String str2) {
            if (!StringUtils.isEmpty(str2)) {
                StringBuilder sb = this.f24010a;
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                sb.append("`");
            }
            return this;
        }

        public final a a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        final byte[] b() {
            return this.f24010a.toString().getBytes();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class b extends c {
        private b() {
            super(k.this, (byte) 0);
        }

        /* synthetic */ b(k kVar, byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.k.c
        protected final String a() {
            return "4ee01a39f0c1";
        }

        @Override // com.uc.webview.internal.stats.k.c
        protected final String b() {
            return GlobalSettings.getStringValue(188);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class c {
        private c() {
        }

        /* synthetic */ c(k kVar, byte b) {
            this();
        }

        protected String a() {
            return "27120f2b4115";
        }

        public final String a(String str) {
            String c;
            String valueOf = String.valueOf(System.currentTimeMillis());
            a.b a2 = a.b.a();
            a2.f23771a = (a() + str + valueOf + "AppChk#2014").getBytes(Charset.forName("UTF-8"));
            if (StringUtils.isEmpty(a2.c())) {
                return null;
            }
            return b() + "?uc_param_str=&chk=" + c.substring(c.length() - 8, c.length()) + "&vno=" + valueOf + "&uuid=" + str + "&app=" + a() + "&zip=gzip&enc=aes";
        }

        protected String b() {
            return GlobalSettings.getStringValue(WSContextConstant.HANDSHAKE_SEND_SIZE);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static boolean a(java.lang.String r7, byte[] r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.k.a(java.lang.String, byte[]):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static byte[] a(byte[] r5) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L21
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L21
            r2.write(r5)     // Catch: java.lang.Throwable -> L1c
            r2.finish()     // Catch: java.lang.Throwable -> L1c
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L1c
            com.uc.webview.base.io.d.a(r2)
            com.uc.webview.base.io.d.a(r1)
            return r5
        L1c:
            r5 = move-exception
            goto L2b
        L1e:
            r5 = move-exception
            r2 = r0
            goto L3b
        L21:
            r5 = move-exception
            r2 = r0
            goto L2b
        L24:
            r5 = move-exception
            r1 = r0
            r2 = r1
            goto L3b
        L28:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L2b:
            java.lang.String r3 = com.uc.webview.internal.stats.k.f24009a     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "zip failed"
            com.uc.webview.base.Log.d(r3, r4, r5)     // Catch: java.lang.Throwable -> L3a
            com.uc.webview.base.io.d.a(r2)
            com.uc.webview.base.io.d.a(r1)
            return r0
        L3a:
            r5 = move-exception
        L3b:
            com.uc.webview.base.io.d.a(r2)
            com.uc.webview.base.io.d.a(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.k.a(byte[]):byte[]");
    }

    public final boolean a(List<d> list) {
        String a2;
        byte[] bArr;
        Log.d(f24009a, "upload start");
        try {
            a2 = (EnvInfo.a() ? new b(this, (byte) 0) : new c(this, (byte) 0)).a(EnvInfo.l());
        } catch (Throwable th) {
            Log.e(f24009a, "upload failed", th);
        }
        if (StringUtils.isEmpty(a2)) {
            Log.e(f24009a, "generateServerUrl falied");
            return false;
        }
        a aVar = new a("uc");
        HashMap hashMap = new HashMap();
        i.a();
        i.a(hashMap);
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        for (d dVar : list) {
            aVar.a().a("lt", "ev").a(com.taobao.tao.content.business.b.CT, "corepv").a("ev_ac", dVar.f23997a).a(dVar.b);
        }
        aVar.a().a("stat_size", String.valueOf(aVar.b().length));
        StringBuilder sb = new StringBuilder("InfoBuilder.end {\n");
        sb.append(aVar.f24010a.toString());
        sb.append("\n}");
        Log.b();
        a.C1033a c1033a = new a.C1033a(a(aVar.b())) { // from class: com.uc.webview.internal.stats.k.1
            @Override // com.uc.webview.base.a.C1033a
            public final byte[] a() {
                int length = this.f23770a.length;
                byte[] bArr2 = new byte[length + 16];
                bArr2[0] = (byte) length;
                bArr2[1] = (byte) (length >> 8);
                bArr2[2] = (byte) (length >> 16);
                bArr2[3] = (byte) (length >>> 24);
                for (int i = 4; i < 16; i++) {
                    bArr2[i] = 0;
                }
                System.arraycopy(this.f23770a, 0, bArr2, 16, length);
                return bArr2;
            }
        };
        bArr = com.uc.webview.base.a.b;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        int i = 3;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] doFinal = cipher.doFinal(c1033a.a());
        while (!a(a2, doFinal)) {
            i--;
            if (i <= 0) {
                return false;
            }
        }
        return true;
    }
}
