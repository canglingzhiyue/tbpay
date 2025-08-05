package io.unicorn.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import tb.kge;
import tb.mto;

/* loaded from: classes9.dex */
public class AndroidTouchProcessor {
    private static final Matrix c;

    /* renamed from: a  reason: collision with root package name */
    private final io.unicorn.embedding.engine.renderer.a f24799a;
    private final e b = e.a();
    private final boolean d;

    /* loaded from: classes9.dex */
    private @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    /* loaded from: classes9.dex */
    private @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int UNKNOWN = 4;
    }

    /* loaded from: classes9.dex */
    private @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCROLL = 1;
        public static final int UNKNOWN = 2;
    }

    static {
        kge.a(-1484191094);
        c = new Matrix();
    }

    public AndroidTouchProcessor(io.unicorn.embedding.engine.renderer.a aVar, boolean z) {
        this.f24799a = aVar;
        this.d = z;
    }

    private int a(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    public static void a() {
    }

    private void a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        float[] fArr;
        long j;
        double d;
        double d2;
        double d3;
        InputDevice.MotionRange motionRange;
        if (i2 == -1) {
            return;
        }
        long b = this.d ? this.b.a(motionEvent).b() : 0L;
        int b2 = b(motionEvent.getToolType(i));
        int i4 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        byteBuffer.putLong(b);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        byteBuffer.putLong(i2);
        byteBuffer.putLong(b2);
        byteBuffer.putLong(i4);
        byteBuffer.putLong(motionEvent.getPointerId(i));
        byteBuffer.putLong(0L);
        matrix.mapPoints(new float[]{motionEvent.getX(i), motionEvent.getY(i)});
        byteBuffer.putDouble(fArr[0]);
        byteBuffer.putDouble(fArr[1]);
        byteBuffer.putDouble(mto.a.GEO_NOT_SUPPORT);
        byteBuffer.putDouble(mto.a.GEO_NOT_SUPPORT);
        if (b2 == 1) {
            j = motionEvent.getButtonState() & 31;
            if (j == 0 && motionEvent.getSource() == 8194 && (i2 == 4 || i2 == 5)) {
                j = 1;
            }
        } else {
            j = b2 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        byteBuffer.putLong(j);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i));
        double d4 = 1.0d;
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d = mto.a.GEO_NOT_SUPPORT;
        } else {
            d = motionRange.getMin();
            d4 = motionRange.getMax();
        }
        byteBuffer.putDouble(d);
        byteBuffer.putDouble(d4);
        if (b2 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i));
            d2 = mto.a.GEO_NOT_SUPPORT;
        } else {
            d2 = mto.a.GEO_NOT_SUPPORT;
            byteBuffer.putDouble(mto.a.GEO_NOT_SUPPORT);
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(motionEvent.getSize(i));
        byteBuffer.putDouble(motionEvent.getToolMajor(i));
        byteBuffer.putDouble(motionEvent.getToolMinor(i));
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i));
        if (b2 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i));
        } else {
            byteBuffer.putDouble(d2);
        }
        byteBuffer.putLong(i3);
        if (i4 == 1) {
            byteBuffer.putDouble(-motionEvent.getAxisValue(10));
            d3 = -motionEvent.getAxisValue(9);
        } else {
            d3 = mto.a.GEO_NOT_SUPPORT;
            byteBuffer.putDouble(mto.a.GEO_NOT_SUPPORT);
        }
        byteBuffer.putDouble(d3);
    }

    private int b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
            return i != 4 ? 4 : 3;
        }
        return 0;
    }

    public boolean a(MotionEvent motionEvent) {
        return a(motionEvent, c);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 29
            int r1 = r1 << 3
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.a(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L27
            r4 = 5
            if (r2 != r4) goto L25
            goto L27
        L25:
            r4 = 0
            goto L28
        L27:
            r4 = 1
        L28:
            if (r4 != 0) goto L31
            if (r2 == r10) goto L2f
            r5 = 6
            if (r2 != r5) goto L31
        L2f:
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            if (r4 == 0) goto L42
        L34:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L70
        L42:
            if (r2 == 0) goto L60
            r11 = 0
        L45:
            if (r11 >= r0) goto L34
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L5d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L5d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
        L5d:
            int r11 = r11 + 1
            goto L45
        L60:
            r11 = 0
        L61:
            if (r11 >= r0) goto L70
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L61
        L70:
            int r13 = r1.position()
            int r13 = r13 % 232
            if (r13 != 0) goto L82
            io.unicorn.embedding.engine.renderer.a r13 = r12.f24799a
            int r14 = r1.position()
            r13.a(r1, r14)
            return r10
        L82:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.embedding.android.AndroidTouchProcessor.a(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }

    public boolean b(MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int a2 = a(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((motionEvent.getPointerCount() * 29) << 3);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), a2, 0, c, allocateDirect);
        if (allocateDirect.position() % 232 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f24799a.a(allocateDirect, allocateDirect.position());
        return true;
    }
}
