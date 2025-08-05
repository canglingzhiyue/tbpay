package io.unicorn.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.taobao.android.weex_framework.util.s;
import io.unicorn.plugin.platform.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.rtd;
import tb.rtk;
import tb.rtv;
import tb.rtw;

/* loaded from: classes9.dex */
public class AccessibilityBridge extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final int f24885a;
    private static final int b;
    private static int c;
    private final AccessibilityManager.TouchExplorationStateChangeListener A;
    private final ContentObserver B;
    private final View d;
    private final rtk e;
    private final AccessibilityManager f;
    private final AccessibilityViewEmbedder g;
    private final j h;
    private final ContentResolver i;
    private final Map<Integer, d> j;
    private final Map<Integer, a> k;
    private d l;
    private Integer m;
    private Integer n;
    private int o;
    private d p;
    private d q;
    private d r;
    private final List<Integer> s;
    private int t;
    private Integer u;
    private c v;
    private boolean w;
    private Boolean x;
    private final rtk.a y;
    private final AccessibilityManager.AccessibilityStateChangeListener z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.unicorn.view.AccessibilityBridge$7  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24892a = new int[StringAttributeType.values().length];

        static {
            try {
                f24892a[StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24892a[StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        
        final int value;

        AccessibilityFeature(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes9.dex */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        
        public final int value;

        Action(int i) {
            this.value = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216);
        
        final int value;

        Flag(int i) {
            this.value = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i) {
            return i != 1 ? i != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f24893a = -1;
        private int b = -1;
        private int c = -1;
        private String d;
        private String e;

        static {
            kge.a(371735868);
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class b extends f {

        /* renamed from: a  reason: collision with root package name */
        String f24894a;

        static {
            kge.a(-854807654);
        }

        private b() {
            super();
        }
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a(boolean z, boolean z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class d {
        private TextDirection A;
        private int C;
        private int D;
        private int E;
        private int F;
        private float G;
        private float H;
        private float I;
        private String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        private d Q;
        private List<a> T;
        private a U;
        private a V;
        private float[] X;
        private float[] Z;

        /* renamed from: a  reason: collision with root package name */
        final AccessibilityBridge f24895a;
        private Rect aa;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private float l;
        private float m;
        private float n;
        private String o;
        private List<f> p;
        private String q;
        private List<f> r;
        private String s;
        private List<f> t;
        private String u;
        private List<f> v;
        private String w;
        private List<f> x;
        private String y;
        private int b = -1;
        private int z = -1;
        private boolean B = false;
        private List<d> R = new ArrayList();
        private List<d> S = new ArrayList();
        private boolean W = true;
        private boolean Y = true;

        static {
            kge.a(-348939304);
        }

        d(AccessibilityBridge accessibilityBridge) {
            this.f24895a = accessibilityBridge;
        }

        private float a(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        private SpannableString a(String str, List<f> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (f fVar : list) {
                    int i = AnonymousClass7.f24892a[fVar.d.ordinal()];
                    if (i == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), fVar.b, fVar.c, 0);
                    } else if (i == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((b) fVar).f24894a)), fVar.b, fVar.c, 0);
                    }
                }
            }
            return spannableString;
        }

        private d a(rtv<d> rtvVar) {
            for (d dVar = this.Q; dVar != null; dVar = dVar.Q) {
                if (rtvVar.a(dVar)) {
                    return dVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public d a(float[] fArr) {
            float f = fArr[3];
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 >= this.L && f2 < this.N && f3 >= this.M && f3 < this.O) {
                float[] fArr2 = new float[4];
                for (d dVar : this.S) {
                    if (!dVar.a(Flag.IS_HIDDEN)) {
                        dVar.c();
                        Matrix.multiplyMV(fArr2, 0, dVar.X, 0, fArr, 0);
                        d a2 = dVar.a(fArr2);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (e()) {
                    return this;
                }
            }
            return null;
        }

        private List<f> a(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i = byteBuffer.getInt();
            if (i == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                int i4 = byteBuffer.getInt();
                StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
                int i5 = AnonymousClass7.f24892a[stringAttributeType.ordinal()];
                if (i5 == 1) {
                    byteBuffer.getInt();
                    e eVar = new e();
                    eVar.b = i3;
                    eVar.c = i4;
                    eVar.d = stringAttributeType;
                    arrayList.add(eVar);
                } else if (i5 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    b bVar = new b();
                    bVar.b = i3;
                    bVar.c = i4;
                    bVar.d = stringAttributeType;
                    bVar.f24894a = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.q;
            this.K = this.o;
            this.C = this.c;
            this.D = this.d;
            this.E = this.g;
            this.F = this.h;
            this.G = this.l;
            this.H = this.m;
            this.I = this.n;
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            this.o = i == -1 ? null : strArr[i];
            this.p = a(byteBuffer, byteBufferArr);
            int i2 = byteBuffer.getInt();
            this.q = i2 == -1 ? null : strArr[i2];
            this.r = a(byteBuffer, byteBufferArr);
            int i3 = byteBuffer.getInt();
            this.s = i3 == -1 ? null : strArr[i3];
            this.t = a(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            this.u = i4 == -1 ? null : strArr[i4];
            this.v = a(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.w = i5 == -1 ? null : strArr[i5];
            this.x = a(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.y = i6 == -1 ? null : strArr[i6];
            this.A = TextDirection.fromInt(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                this.P[i7] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i8 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i9 = 0; i9 < i8; i9++) {
                d a2 = this.f24895a.a(byteBuffer.getInt());
                a2.Q = this;
                this.R.add(a2);
            }
            for (int i10 = 0; i10 < i8; i10++) {
                d a3 = this.f24895a.a(byteBuffer.getInt());
                a3.Q = this;
                this.S.add(a3);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                this.T = null;
                return;
            }
            List<a> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i11);
            } else {
                list.clear();
            }
            for (int i12 = 0; i12 < i11; i12++) {
                a b = this.f24895a.b(byteBuffer.getInt());
                if (b.c == Action.TAP.value) {
                    this.U = b;
                } else if (b.c == Action.LONG_PRESS.value) {
                    this.V = b;
                } else {
                    this.T.add(b);
                }
                this.T.add(b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(List<d> list) {
            if (a(Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (d dVar : this.R) {
                dVar.a(list);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(float[] fArr, Set<d> set, boolean z) {
            set.add(this);
            if (this.Y) {
                z = true;
            }
            if (z) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = {this.L, this.M, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                a(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                a(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                a(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                a(fArr6, this.Z, fArr2);
                if (this.aa == null) {
                    this.aa = new Rect();
                }
                this.aa.set(Math.round(a(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(a(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(b(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(b(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i = -1;
            for (d dVar : this.R) {
                dVar.z = i;
                i = dVar.b;
                dVar.a(this.Z, set, z);
            }
        }

        private void a(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return !Float.isNaN(this.l) && !Float.isNaN(this.G) && this.G != this.l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(Action action) {
            return (action.value & this.d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(Flag flag) {
            return (flag.value & this.c) != 0;
        }

        private float b(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            String str;
            if (this.o == null && this.K == null) {
                return false;
            }
            String str2 = this.o;
            return str2 == null || (str = this.K) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(Action action) {
            return (action.value & this.D) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(Flag flag) {
            return (flag.value & this.C) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(d dVar, rtv<d> rtvVar) {
            return (dVar == null || dVar.a(rtvVar) == null) ? false : true;
        }

        private void c() {
            if (!this.W) {
                return;
            }
            this.W = false;
            if (this.X == null) {
                this.X = new float[16];
            }
            if (Matrix.invertM(this.X, 0, this.P, 0)) {
                return;
            }
            Arrays.fill(this.X, 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect d() {
            return this.aa;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            String str;
            String str2;
            String str3;
            if (a(Flag.SCOPES_ROUTE)) {
                return false;
            }
            return a(Flag.IS_FOCUSABLE) || (this.d & (~AccessibilityBridge.f24885a)) != 0 || (this.c & AccessibilityBridge.b) != 0 || ((str = this.o) != null && !str.isEmpty()) || (((str2 = this.q) != null && !str2.isEmpty()) || ((str3 = this.w) != null && !str3.isEmpty()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String f() {
            String str;
            if (!a(Flag.NAMES_ROUTE) || (str = this.o) == null || str.isEmpty()) {
                for (d dVar : this.R) {
                    String f = dVar.f();
                    if (f != null && !f.isEmpty()) {
                        return f;
                    }
                }
                return null;
            }
            return this.o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence g() {
            CharSequence[] charSequenceArr;
            CharSequence charSequence = null;
            for (CharSequence charSequence2 : Build.VERSION.SDK_INT < 21 ? new CharSequence[]{this.q, this.o, this.w} : new CharSequence[]{a(this.q, this.r), a(this.o, this.p), a(this.w, this.x)}) {
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class e extends f {
        static {
            kge.a(823949614);
        }

        private e() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class f {
        int b;
        int c;
        StringAttributeType d;

        static {
            kge.a(-732001260);
        }

        private f() {
        }
    }

    static {
        kge.a(-749081267);
        f24885a = Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value | Action.SCROLL_UP.value | Action.SCROLL_DOWN.value;
        b = Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value | Flag.IS_SELECTED.value | Flag.IS_TEXT_FIELD.value | Flag.IS_FOCUSED.value | Flag.HAS_ENABLED_STATE.value | Flag.IS_ENABLED.value | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value | Flag.HAS_TOGGLED_STATE.value | Flag.IS_TOGGLED.value | Flag.IS_FOCUSABLE.value | Flag.IS_SLIDER.value;
        c = 267386881;
    }

    public AccessibilityBridge(View view, rtk rtkVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, j jVar) {
        this(view, rtkVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), jVar);
    }

    public AccessibilityBridge(View view, rtk rtkVar, final AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, j jVar) {
        this.j = new HashMap();
        this.k = new HashMap();
        this.o = 0;
        this.s = new ArrayList();
        this.t = 0;
        this.u = 0;
        this.w = false;
        this.x = null;
        this.y = new rtk.a() { // from class: io.unicorn.view.AccessibilityBridge.1
            @Override // tb.rtk.a
            public void a(int i) {
                AccessibilityBridge.this.a(i, 1);
            }

            @Override // tb.rtk.a
            public void a(String str) {
                AccessibilityBridge.this.d.announceForAccessibility(str);
            }

            @Override // io.unicorn.embedding.engine.FlutterJNI.a
            public void a(ByteBuffer byteBuffer, String[] strArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                AccessibilityBridge.this.a(byteBuffer, strArr);
            }

            @Override // io.unicorn.embedding.engine.FlutterJNI.a
            public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (ByteBuffer byteBuffer2 : byteBufferArr) {
                    byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
                }
                AccessibilityBridge.this.a(byteBuffer, strArr, byteBufferArr);
            }

            @Override // tb.rtk.a
            public void b(int i) {
                AccessibilityBridge.this.a(i, 2);
            }

            @Override // tb.rtk.a
            public void b(String str) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                AccessibilityEvent b2 = AccessibilityBridge.this.b(0, 32);
                b2.getText().add(str);
                AccessibilityBridge.this.a(b2);
            }

            @Override // tb.rtk.a
            public void c(int i) {
                AccessibilityBridge.this.a(i, 8);
            }
        };
        this.z = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.unicorn.view.AccessibilityBridge.2
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public void onAccessibilityStateChanged(boolean z) {
                if (AccessibilityBridge.this.w) {
                    return;
                }
                AccessibilityBridge.this.a(z && AccessibilityBridge.this.f.isTouchExplorationEnabled());
                if (AccessibilityBridge.this.v == null) {
                    return;
                }
                AccessibilityBridge.this.v.a(z, AccessibilityBridge.this.f.isTouchExplorationEnabled());
            }
        };
        this.B = new ContentObserver(new Handler()) { // from class: io.unicorn.view.AccessibilityBridge.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                onChange(z, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                AccessibilityBridge accessibilityBridge;
                int i;
                if (AccessibilityBridge.this.w) {
                    return;
                }
                String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(AccessibilityBridge.this.i, "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    accessibilityBridge = AccessibilityBridge.this;
                    i = accessibilityBridge.o | AccessibilityFeature.DISABLE_ANIMATIONS.value;
                } else {
                    accessibilityBridge = AccessibilityBridge.this;
                    i = accessibilityBridge.o & (~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                }
                accessibilityBridge.o = i;
                AccessibilityBridge.this.f();
            }
        };
        s.a("AccessibilityBridge");
        this.d = view;
        this.e = rtkVar;
        this.f = accessibilityManager;
        this.i = contentResolver;
        this.g = accessibilityViewEmbedder;
        this.h = jVar;
        this.z.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        this.f.addAccessibilityStateChangeListener(this.z);
        if (Build.VERSION.SDK_INT >= 19) {
            this.A = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.unicorn.view.AccessibilityBridge.4
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public void onTouchExplorationStateChanged(boolean z) {
                    AccessibilityBridge accessibilityBridge;
                    int i;
                    if (AccessibilityBridge.this.w) {
                        return;
                    }
                    s.a("onTouchExplorationStateChanged");
                    if (z) {
                        accessibilityBridge = AccessibilityBridge.this;
                        i = accessibilityBridge.o | AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
                    } else {
                        AccessibilityBridge.this.h();
                        accessibilityBridge = AccessibilityBridge.this;
                        i = accessibilityBridge.o & (~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value);
                    }
                    accessibilityBridge.o = i;
                    AccessibilityBridge.this.f();
                    AccessibilityBridge.this.a(accessibilityManager.isEnabled() && z);
                    if (AccessibilityBridge.this.v != null) {
                        AccessibilityBridge.this.v.a(accessibilityManager.isEnabled(), z);
                    }
                    s.b("onTouchExplorationStateChanged");
                }
            };
            this.A.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            this.f.addTouchExplorationStateChangeListener(this.A);
        } else {
            this.A = null;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.B.onChange(false);
            this.i.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.B);
        }
        jVar.a(this);
        s.b("AccessibilityBridge");
    }

    private Rect a(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.d.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    private AccessibilityEvent a(int i, String str, String str2) {
        AccessibilityEvent b2 = b(i, 16);
        b2.setBeforeText(str);
        b2.getText().add(str2);
        int i2 = 0;
        while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
            i2++;
        }
        if (i2 >= str.length() && i2 >= str2.length()) {
            b2.recycle();
            return null;
        }
        b2.setFromIndex(i2);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        b2.setRemovedCount((length - i2) + 1);
        b2.setAddedCount((length2 - i2) + 1);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d a(int i) {
        d dVar = this.j.get(Integer.valueOf(i));
        if (dVar == null) {
            d dVar2 = new d(this);
            dVar2.b = i;
            this.j.put(Integer.valueOf(i), dVar2);
            return dVar2;
        }
        return dVar;
    }

    private void a(float f2, float f3) {
        d a2;
        if (!this.j.isEmpty() && (a2 = g().a(new float[]{f2, f3, 0.0f, 1.0f})) != this.r) {
            if (a2 != null) {
                a(a2.b, 128);
            }
            d dVar = this.r;
            if (dVar != null) {
                a(dVar.b, 256);
            }
            this.r = a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        if (!this.f.isEnabled()) {
            return;
        }
        a(b(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AccessibilityEvent accessibilityEvent) {
        if (!this.f.isEnabled()) {
            return;
        }
        this.d.getParent().requestSendAccessibilityEvent(this.d, accessibilityEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
        r5 = r4.q.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        r4.h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5.find() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r5.find() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
        if (r5.find() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        r4.h += r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
        if (r5.find() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(io.unicorn.view.AccessibilityBridge.d r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            if (r0 < 0) goto L11c
            int r0 = io.unicorn.view.AccessibilityBridge.d.f(r4)
            if (r0 >= 0) goto Le
            goto L11c
        Le:
            r0 = 1
            if (r5 == r0) goto Led
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L8c
            r1 = 4
            if (r5 == r1) goto L36
            r0 = 8
            if (r5 == r0) goto L22
            r0 = 16
            if (r5 == r0) goto L22
            goto L113
        L22:
            if (r6 == 0) goto L31
        L24:
            java.lang.String r5 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r5 = r5.length()
        L2c:
            io.unicorn.view.AccessibilityBridge.d.b(r4, r5)
            goto L113
        L31:
            io.unicorn.view.AccessibilityBridge.d.b(r4, r2)
            goto L113
        L36:
            if (r6 == 0) goto L63
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            java.lang.String r1 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L63
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r1 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
            goto Lbb
        L63:
            if (r6 != 0) goto L113
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            if (r5 <= 0) goto L113
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r1 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L31
        L87:
            int r5 = r5.start(r0)
            goto L2c
        L8c:
            if (r6 == 0) goto Lc8
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            java.lang.String r1 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lc8
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r1 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
        Lbb:
            int r6 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            int r5 = r5.start(r0)
            int r6 = r6 + r5
            io.unicorn.view.AccessibilityBridge.d.b(r4, r6)
            goto L113
        Lc8:
            if (r6 != 0) goto L113
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            if (r5 <= 0) goto L113
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r1 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L113
            goto L87
        Led:
            if (r6 == 0) goto L104
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            java.lang.String r1 = io.unicorn.view.AccessibilityBridge.d.i(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L104
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            int r5 = r5 + r0
            goto L2c
        L104:
            if (r6 != 0) goto L113
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            if (r5 <= 0) goto L113
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            int r5 = r5 - r0
            goto L2c
        L113:
            if (r7 != 0) goto L11c
            int r5 = io.unicorn.view.AccessibilityBridge.d.g(r4)
            io.unicorn.view.AccessibilityBridge.d.a(r4, r5)
        L11c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.view.AccessibilityBridge.a(io.unicorn.view.AccessibilityBridge$d, int, boolean, boolean):void");
    }

    private void a(String str) {
        this.d.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Boolean bool = this.x;
        if (bool == null || z != bool.booleanValue()) {
            this.x = Boolean.valueOf(z);
            if (z) {
                this.e.a(this.y);
                this.e.a();
                return;
            }
            this.e.a((rtk.a) null);
            this.e.b();
        }
    }

    private boolean a(final d dVar) {
        if (dVar.j > 0) {
            return d.b(this.l, new rtv<d>() { // from class: io.unicorn.view.AccessibilityBridge.5
                @Override // tb.rtv
                public boolean a(d dVar2) {
                    return dVar2 == dVar;
                }
            }) || !d.b(this.l, new rtv<d>() { // from class: io.unicorn.view.AccessibilityBridge.6
                @Override // tb.rtv
                public boolean a(d dVar2) {
                    return dVar2.a(Flag.HAS_IMPLICIT_SCROLLING);
                }
            });
        }
        return false;
    }

    private boolean a(d dVar, int i, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE)) ? "" : bundle.getString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE);
        this.e.a(i, Action.SET_TEXT, string);
        dVar.q = string;
        dVar.r = null;
        return true;
    }

    private boolean a(d dVar, int i, Bundle bundle, boolean z) {
        rtk rtkVar;
        Action action;
        int i2 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT);
        boolean z2 = bundle.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN);
        int i3 = dVar.g;
        int i4 = dVar.h;
        a(dVar, i2, z, z2);
        if (i3 != dVar.g || i4 != dVar.h) {
            String str = dVar.q != null ? dVar.q : "";
            AccessibilityEvent b2 = b(dVar.b, 8192);
            b2.getText().add(str);
            b2.setFromIndex(dVar.g);
            b2.setToIndex(dVar.h);
            b2.setItemCount(str.length());
            a(b2);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return i2 == 4 || i2 == 8 || i2 == 16;
            } else if (z && dVar.a(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                rtkVar = this.e;
                action = Action.MOVE_CURSOR_FORWARD_BY_WORD;
            } else if (z || !dVar.a(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                return false;
            } else {
                rtkVar = this.e;
                action = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
            }
        } else if (z && dVar.a(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
            rtkVar = this.e;
            action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
        } else if (z || !dVar.a(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
            return false;
        } else {
            rtkVar = this.e;
            action = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
        }
        rtkVar.a(i, action, Boolean.valueOf(z2));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent b(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setPackageName(this.d.getContext().getPackageName());
        obtain.setSource(this.d, i);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(int i) {
        a aVar = this.k.get(Integer.valueOf(i));
        if (aVar == null) {
            a aVar2 = new a();
            aVar2.b = i;
            aVar2.f24893a = c + i;
            this.k.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }
        return aVar;
    }

    private void b(d dVar) {
        String f2 = dVar.f();
        if (f2 == null) {
            f2 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            a(f2);
            return;
        }
        AccessibilityEvent b2 = b(dVar.b, 32);
        b2.getText().add(f2);
        a(b2);
    }

    private void c(int i) {
        AccessibilityEvent b2 = b(i, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            b2.setContentChangeTypes(1);
        }
        a(b2);
    }

    private void c(d dVar) {
        View a2;
        Integer num;
        dVar.Q = null;
        if (dVar.i != -1 && (num = this.m) != null && this.g.platformViewOfNode(num.intValue()) == this.h.a(dVar.i)) {
            a(this.m.intValue(), 65536);
            this.m = null;
        }
        if (dVar.i != -1 && (a2 = this.h.a(dVar.i)) != null) {
            a2.setImportantForAccessibility(4);
        }
        d dVar2 = this.l;
        if (dVar2 == dVar) {
            a(dVar2.b, 65536);
            this.l = null;
        }
        if (this.p == dVar) {
            this.p = null;
        }
        if (this.r == dVar) {
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.e.a(this.o);
    }

    private d g() {
        return this.j.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d dVar = this.r;
        if (dVar != null) {
            a(dVar.b, 256);
            this.r = null;
        }
    }

    private boolean i() {
        Activity a2 = rtw.a(this.d.getContext());
        if (a2 == null || a2.getWindow() == null) {
            return false;
        }
        int i = a2.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i == 2 || i == 0;
    }

    public AccessibilityNodeInfo a(View view, int i) {
        return AccessibilityNodeInfo.obtain(view, i);
    }

    public void a() {
        this.w = true;
        this.h.a();
        a((c) null);
        this.f.removeAccessibilityStateChangeListener(this.z);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f.removeTouchExplorationStateChangeListener(this.A);
        }
        this.i.unregisterContentObserver(this.B);
        this.e.a((rtk.a) null);
    }

    public void a(c cVar) {
        this.v = cVar;
    }

    void a(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            a b2 = b(byteBuffer.getInt());
            b2.c = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str = null;
            b2.d = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            if (i2 != -1) {
                str = strArr[i2];
            }
            b2.e = str;
        }
    }

    void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        d dVar;
        d dVar2;
        float f2;
        float f3;
        WindowInsets rootWindowInsets;
        View a2;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            d a3 = a(byteBuffer.getInt());
            a3.a(byteBuffer, strArr, byteBufferArr);
            if (!a3.a(Flag.IS_HIDDEN)) {
                if (a3.a(Flag.IS_FOCUSED)) {
                    this.p = a3;
                }
                if (a3.B) {
                    arrayList.add(a3);
                }
                if (a3.i != -1 && !this.h.b(a3.i) && (a2 = this.h.a(a3.i)) != null) {
                    a2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        d g = g();
        ArrayList<d> arrayList2 = new ArrayList();
        if (g != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if (Build.VERSION.SDK_INT >= 23) {
                if ((Build.VERSION.SDK_INT >= 28 ? i() : true) && (rootWindowInsets = this.d.getRootWindowInsets()) != null) {
                    if (!this.u.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        g.Y = true;
                        g.W = true;
                    }
                    this.u = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, this.u.intValue(), 0.0f, 0.0f);
                }
            }
            g.a(fArr, (Set<d>) hashSet, false);
            g.a(arrayList2);
        }
        d dVar3 = null;
        for (d dVar4 : arrayList2) {
            if (!this.s.contains(Integer.valueOf(dVar4.b))) {
                dVar3 = dVar4;
            }
        }
        if (dVar3 == null && arrayList2.size() > 0) {
            dVar3 = (d) arrayList2.get(arrayList2.size() - 1);
        }
        if (dVar3 != null && (dVar3.b != this.t || arrayList2.size() != this.s.size())) {
            this.t = dVar3.b;
            b(dVar3);
        }
        this.s.clear();
        for (d dVar5 : arrayList2) {
            this.s.add(Integer.valueOf(dVar5.b));
        }
        Iterator<Map.Entry<Integer, d>> it = this.j.entrySet().iterator();
        while (it.hasNext()) {
            d value = it.next().getValue();
            if (!hashSet.contains(value)) {
                c(value);
                it.remove();
            }
        }
        c(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            d dVar6 = (d) it2.next();
            if (dVar6.a()) {
                AccessibilityEvent b2 = b(dVar6.b, 4096);
                float f4 = dVar6.l;
                float f5 = dVar6.m;
                if (Float.isInfinite(dVar6.m)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(dVar6.n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    f2 = f5 - dVar6.n;
                    f3 = f4 - dVar6.n;
                }
                if (dVar6.b(Action.SCROLL_UP) || dVar6.b(Action.SCROLL_DOWN)) {
                    b2.setScrollY((int) f3);
                    b2.setMaxScrollY((int) f2);
                } else if (dVar6.b(Action.SCROLL_LEFT) || dVar6.b(Action.SCROLL_RIGHT)) {
                    b2.setScrollX((int) f3);
                    b2.setMaxScrollX((int) f2);
                }
                if (dVar6.j > 0) {
                    b2.setItemCount(dVar6.j);
                    b2.setFromIndex(dVar6.k);
                    int i = 0;
                    for (d dVar7 : dVar6.S) {
                        if (!dVar7.a(Flag.IS_HIDDEN)) {
                            i++;
                        }
                    }
                    b2.setToIndex((dVar6.k + i) - 1);
                }
                a(b2);
            }
            if (dVar6.a(Flag.IS_LIVE_REGION) && dVar6.b()) {
                c(dVar6.b);
            }
            d dVar8 = this.l;
            if (dVar8 != null && dVar8.b == dVar6.b && !dVar6.b(Flag.IS_SELECTED) && dVar6.a(Flag.IS_SELECTED)) {
                AccessibilityEvent b3 = b(dVar6.b, 4);
                b3.getText().add(dVar6.o);
                a(b3);
            }
            d dVar9 = this.p;
            if (dVar9 != null && dVar9.b == dVar6.b && ((dVar2 = this.q) == null || dVar2.b != this.p.b)) {
                this.q = this.p;
                a(b(dVar6.b, 8));
            } else if (this.p == null) {
                this.q = null;
            }
            d dVar10 = this.p;
            if (dVar10 != null && dVar10.b == dVar6.b && dVar6.b(Flag.IS_TEXT_FIELD) && dVar6.a(Flag.IS_TEXT_FIELD) && ((dVar = this.l) == null || dVar.b == this.p.b)) {
                String str = "";
                String str2 = dVar6.J != null ? dVar6.J : str;
                if (dVar6.q != null) {
                    str = dVar6.q;
                }
                AccessibilityEvent a4 = a(dVar6.b, str2, str);
                if (a4 != null) {
                    a(a4);
                }
                if (dVar6.E != dVar6.g || dVar6.F != dVar6.h) {
                    AccessibilityEvent b4 = b(dVar6.b, 8192);
                    b4.getText().add(str);
                    b4.setFromIndex(dVar6.g);
                    b4.setToIndex(dVar6.h);
                    b4.setItemCount(str.length());
                    a(b4);
                }
            }
        }
    }

    public boolean a(MotionEvent motionEvent) {
        if (this.f.isTouchExplorationEnabled() && !this.j.isEmpty()) {
            d a2 = g().a(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
            if (a2 != null && a2.i != -1) {
                return this.g.onAccessibilityHoverEvent(a2.b, motionEvent);
            }
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                a(motionEvent.getX(), motionEvent.getY());
            } else if (motionEvent.getAction() != 10) {
                rtd.c("unicorn", "unexpected accessibility hover event: " + motionEvent);
                return false;
            } else {
                h();
            }
            return true;
        }
        return false;
    }

    public boolean b() {
        return this.f.isEnabled();
    }

    public boolean c() {
        return this.f.isTouchExplorationEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x046f A[LOOP:0: B:253:0x0469->B:255:0x046f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0494  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.view.AccessibilityBridge.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r2 != null) goto L11;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.unicorn.view.AccessibilityBridge$d r2 = r1.p
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.unicorn.view.AccessibilityBridge.d.a(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.n
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.unicorn.view.AccessibilityBridge$d r2 = r1.l
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.m
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.view.AccessibilityBridge.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        rtk rtkVar;
        Action action;
        rtk rtkVar2;
        Action action2;
        int i3;
        if (i >= 65536) {
            boolean performAction = this.g.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.m = null;
            }
            return performAction;
        }
        d dVar = this.j.get(Integer.valueOf(i));
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        switch (i2) {
            case 16:
                this.e.a(i, Action.TAP);
                return true;
            case 32:
                this.e.a(i, Action.LONG_PRESS);
                return true;
            case 64:
                if (this.l == null) {
                    this.d.invalidate();
                }
                this.l = dVar;
                this.e.a(i, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                a(i, 32768);
                if (dVar.a(Action.INCREASE) || dVar.a(Action.DECREASE)) {
                    a(i, 4);
                }
                return true;
            case 128:
                d dVar2 = this.l;
                if (dVar2 != null && dVar2.b == i) {
                    this.l = null;
                }
                Integer num = this.m;
                if (num != null && num.intValue() == i) {
                    this.m = null;
                }
                this.e.a(i, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                a(i, 65536);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT >= 18) {
                    return a(dVar, i, bundle, true);
                }
                return false;
            case 512:
                if (Build.VERSION.SDK_INT >= 18) {
                    return a(dVar, i, bundle, false);
                }
                return false;
            case 4096:
                if (dVar.a(Action.SCROLL_UP)) {
                    rtkVar = this.e;
                    action = Action.SCROLL_UP;
                } else if (dVar.a(Action.SCROLL_LEFT)) {
                    rtkVar = this.e;
                    action = Action.SCROLL_LEFT;
                } else if (!dVar.a(Action.INCREASE)) {
                    return false;
                } else {
                    dVar.q = dVar.s;
                    dVar.r = dVar.t;
                    a(i, 4);
                    rtkVar = this.e;
                    action = Action.INCREASE;
                }
                rtkVar.a(i, action);
                return true;
            case 8192:
                if (dVar.a(Action.SCROLL_DOWN)) {
                    rtkVar2 = this.e;
                    action2 = Action.SCROLL_DOWN;
                } else if (dVar.a(Action.SCROLL_RIGHT)) {
                    rtkVar2 = this.e;
                    action2 = Action.SCROLL_RIGHT;
                } else if (!dVar.a(Action.DECREASE)) {
                    return false;
                } else {
                    dVar.q = dVar.u;
                    dVar.r = dVar.v;
                    a(i, 4);
                    rtkVar2 = this.e;
                    action2 = Action.DECREASE;
                }
                rtkVar2.a(i, action2);
                return true;
            case 16384:
                this.e.a(i, Action.COPY);
                return true;
            case 32768:
                this.e.a(i, Action.PASTE);
                return true;
            case 65536:
                this.e.a(i, Action.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT) && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT)) {
                    z = true;
                }
                if (z) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT)));
                    i3 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT);
                } else {
                    hashMap.put("base", Integer.valueOf(dVar.h));
                    i3 = dVar.h;
                }
                hashMap.put("extent", Integer.valueOf(i3));
                this.e.a(i, Action.SET_SELECTION, hashMap);
                d dVar3 = this.j.get(Integer.valueOf(i));
                dVar3.g = ((Integer) hashMap.get("base")).intValue();
                dVar3.h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.e.a(i, Action.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT >= 21) {
                    return a(dVar, i, bundle);
                }
                return false;
            case 16908342:
                this.e.a(i, Action.SHOW_ON_SCREEN);
                return true;
            default:
                a aVar = this.k.get(Integer.valueOf(i2 - c));
                if (aVar == null) {
                    return false;
                }
                this.e.a(i, Action.CUSTOM_ACTION, Integer.valueOf(aVar.b));
                return true;
        }
    }
}
