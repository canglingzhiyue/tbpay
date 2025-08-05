package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.taobao.artc.api.AConstants;
import com.taobao.message.datasdk.facade.message.MessageType;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.base.cyclone.BSPatch;
import com.uc.webview.base.cyclone.BSPatchResult;
import com.uc.webview.internal.setup.component.j;
import com.uc.webview.internal.setup.component.n;
import com.uc.webview.internal.setup.component.o;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class w {
    static final /* synthetic */ boolean c = !w.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    final String f23939a;
    final j.a b;
    private final String d;
    private final v[] e;
    private final u f;
    private v g;
    private boolean h;
    private boolean i;
    private n.b j;
    private n.a k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class a implements n.a {
        private a() {
        }

        /* synthetic */ a(w wVar, byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.component.n.a
        public final boolean a(n.d dVar, boolean z, boolean z2) {
            return w.this.a(dVar);
        }

        @Override // com.uc.webview.internal.setup.component.n.a
        public final boolean a(n.j jVar) {
            j.a aVar;
            int i;
            List<n.d> list = jVar != null ? jVar.f23928a : null;
            if (list != null && !list.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (n.d dVar : list) {
                    hashMap.put(dVar.a(), dVar);
                }
                if (!w.this.a(hashMap)) {
                    aVar = w.this.b;
                    i = -457;
                }
                return w.this.h;
            }
            aVar = w.this.b;
            i = -456;
            aVar.a(i, w.this.a());
            return w.this.h;
        }

        @Override // com.uc.webview.internal.setup.component.n.a
        public final boolean j() {
            return !w.this.h;
        }

        @Override // com.uc.webview.internal.setup.component.n.a
        public final void k() {
            if (w.this.h) {
                return;
            }
            w.this.b.a(-263, w.this.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(String str, j.a aVar, v[] vVarArr, u uVar) {
        this.f23939a = str;
        this.d = str;
        this.b = aVar;
        this.e = vVarArr;
        this.f = uVar;
    }

    static /* synthetic */ void a(w wVar) {
        wVar.b.b(BSError.BSDIFF_PATCH_FILE_INVALID_DIFF_SIZE);
        wVar.a(n.a());
        if (!wVar.h) {
            wVar.j = n.b.a(GlobalSettings.get((int) MessageType.WEEX_CARD_CENTER, ""));
            wVar.k = new a(wVar, (byte) 0);
            wVar.j.a(wVar.f23939a, wVar.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[LOOP:0: B:8:0x001b->B:23:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.uc.webview.internal.setup.component.n.d r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L71
            java.lang.String r1 = r11.b()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Le
            goto L71
        Le:
            com.uc.webview.internal.setup.component.i r1 = new com.uc.webview.internal.setup.component.i
            java.lang.String r2 = r11.b()
            r1.<init>(r2)
            com.uc.webview.internal.setup.component.v[] r2 = r10.e
            int r3 = r2.length
            r4 = 0
        L1b:
            r5 = 1
            if (r4 >= r3) goto L5c
            r6 = r2[r4]
            boolean r7 = r6.c
            if (r7 != 0) goto L2f
            com.uc.webview.internal.setup.component.o r7 = r6.e
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L2f
            com.uc.webview.internal.setup.component.o r7 = r6.e
            goto L39
        L2f:
            com.uc.webview.internal.setup.component.o r7 = r6.f
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L4f
            com.uc.webview.internal.setup.component.o r7 = r6.f
        L39:
            r7.b = r1
            java.lang.String r8 = r6.f23938a
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r0] = r1
            com.uc.webview.internal.setup.component.q r7 = r7.f23929a
            java.lang.String r7 = r7.f23933a
            r9[r5] = r7
            java.lang.String r7 = "onFoundFileInfo %s for %s"
            com.uc.webview.internal.setup.component.l.a(r8, r7, r9)
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 == 0) goto L59
            com.uc.webview.internal.setup.component.j$a r11 = r10.b
            boolean r11 = r6.a(r11)
            return r11
        L59:
            int r4 = r4 + 1
            goto L1b
        L5c:
            java.lang.String r1 = r1.d
            java.lang.String r2 = r10.d
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L71
            java.lang.String r1 = r10.f23939a
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r0] = r11
            java.lang.String r11 = "not for me - %s"
            com.uc.webview.internal.setup.component.l.a(r1, r11, r2)
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.w.a(com.uc.webview.internal.setup.component.n$d):boolean");
    }

    private void b() {
        v[] vVarArr;
        for (v vVar : this.e) {
            if (!vVar.d) {
                n.a(vVar.f23938a, vVar.e.f23929a.f);
            }
            n.a(vVar.f23938a, vVar.f.f23929a.f);
        }
    }

    static /* synthetic */ void b(w wVar) {
        o.a aVar = new o.a() { // from class: com.uc.webview.internal.setup.component.w.3
            @Override // com.uc.webview.internal.setup.component.o.a
            public final void a() {
                w.c(w.this);
            }
        };
        v vVar = wVar.g;
        vVar.e.a(aVar);
        vVar.f.a(aVar);
        if (vVar.b()) {
            aVar.a();
        }
    }

    static /* synthetic */ void c(w wVar) {
        if (!wVar.i) {
            wVar.i = wVar.g.b();
            if (!wVar.i) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.uc.webview.internal.setup.component.w.4
                @Override // java.lang.Runnable
                public final void run() {
                    w.d(w.this);
                }
            };
            wVar.b.a(BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB, Integer.toString(wVar.g.e.f23929a.b));
            com.uc.webview.base.task.c.a(wVar.f23939a, runnable, new s(wVar.b, AConstants.ArtcErrorIceRecvCandidateTimeout), 1000L);
        }
    }

    static /* synthetic */ void d(w wVar) {
        n.b bVar;
        int a2;
        int i;
        if (wVar.g.a(wVar.b)) {
            v vVar = wVar.g;
            j.a aVar = wVar.b;
            u uVar = wVar.f;
            File b = uVar.b(vVar.f.b);
            String absolutePath = b.getAbsolutePath();
            String absolutePath2 = vVar.e.b.b.getAbsolutePath();
            String absolutePath3 = vVar.f.b.b.getAbsolutePath();
            if (b.exists()) {
                com.uc.webview.base.io.d.a(vVar.f23938a, b, false, (ArrayList<File>) null);
            }
            aVar.a(BSError.BSDIFF_PATCH_OPEN_DIR_FAILED, vVar.e.b.i);
            BSPatchResult patch = BSPatch.patch(absolutePath2, absolutePath3, absolutePath, vVar.h);
            if (!patch.success()) {
                a2 = patch.ec;
                int i2 = patch.ec == -123 ? -270 : -271;
                l.d(vVar.f23938a, "patch failed, %s", patch);
                i = i2;
            } else {
                aVar.a(BSError.BSDIFF_PATCH_FILE_NOT_EXISTS, l.a(absolutePath));
                a2 = uVar.a(vVar.f.b.h, vVar.f.b.i, absolutePath);
                i = a2 != 0 ? -272 : BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM;
            }
            if (i == -143) {
                l.a(4, vVar.f23938a, "newDir: ".concat(String.valueOf(absolutePath)), (Throwable) null);
                aVar.a(BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM, Integer.toString(vVar.e.f23929a.b));
            } else {
                aVar.a(i, vVar.e.b.a() + " ec: " + a2);
                if (b.exists()) {
                    com.uc.webview.base.io.d.a(vVar.f23938a, b);
                }
                if (!vVar.c) {
                    n.a(vVar.f23938a, vVar.e.f23929a.f);
                }
            }
        }
        n.a aVar2 = wVar.k;
        if (aVar2 != null && (bVar = wVar.j) != null) {
            bVar.a(aVar2);
            wVar.k = null;
            wVar.j = null;
        }
        wVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            v[] vVarArr = this.e;
            if (i < vVarArr.length) {
                v vVar = vVarArr[i];
                if (vVar.e.b != null) {
                    i2 |= 1 << i3;
                }
                int i4 = i3 + 1;
                if (vVar.f.b != null) {
                    i2 |= 1 << i4;
                }
                i3 = i4 + 1;
                i++;
            } else {
                return Integer.toBinaryString(i2);
            }
        }
    }

    public final boolean a(Map<String, n.d> map) {
        if (this.h) {
            return true;
        }
        boolean z = false;
        if (map == null || map.isEmpty()) {
            return false;
        }
        l.a(this.f23939a, "handleBundleInfos, info size: %d", Integer.valueOf(map.size()));
        boolean z2 = false;
        for (String str : map.keySet()) {
            n.d dVar = map.get(str);
            if (dVar != null && !TextUtils.isEmpty(dVar.b()) && a(dVar)) {
                z2 = true;
            }
        }
        if (!z2) {
            return false;
        }
        if (!c && this.g != null) {
            throw new AssertionError();
        }
        v[] vVarArr = this.e;
        int length = vVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            v vVar = vVarArr[i];
            if (vVar.a() && (vVar.e.b.b != null || vVar.e.a())) {
                this.g = vVar;
                break;
            }
            i++;
        }
        if (this.g == null) {
            v[] vVarArr2 = this.e;
            int length2 = vVarArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                v vVar2 = vVarArr2[i2];
                if (vVar2.a()) {
                    this.g = vVar2;
                    break;
                }
                i2++;
            }
        }
        if (this.g != null) {
            z = true;
        }
        this.h = z;
        if (this.h) {
            if (this.f.a(this.g.f.b)) {
                this.b.a(BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC, this.g.f.toString());
                b();
            } else {
                Runnable runnable = new Runnable() { // from class: com.uc.webview.internal.setup.component.w.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.b(w.this);
                    }
                };
                this.b.a(BSError.BSDIFF_PATCH_DATA_INVALID_CTRLA, Integer.toString(this.g.e.f23929a.b));
                com.uc.webview.base.task.c.a(this.f23939a, runnable, new s(this.b, AConstants.ArtcErrorIceRecvCandidateTimeout), 1000L);
            }
        }
        return true;
    }
}
