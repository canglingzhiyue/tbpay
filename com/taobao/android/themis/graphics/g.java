package com.taobao.android.themis.graphics;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JNIBridge f15559a;
    private final float b;

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 6) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        return i == 3 ? 0 : -1;
    }

    public g(JNIBridge jNIBridge, float f) {
        this.f15559a = jNIBridge;
        this.b = f <= 0.0f ? 1.0f : f;
    }

    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount * 7) << 3);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int a2 = a(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        if (z) {
            a(motionEvent, motionEvent.getActionIndex(), a2, allocateDirect);
        } else if (z2) {
            while (i < pointerCount) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    a(motionEvent, i, 2, allocateDirect);
                }
                i++;
            }
            a(motionEvent, motionEvent.getActionIndex(), a2, allocateDirect);
        } else {
            while (i < pointerCount) {
                a(motionEvent, i, a2, allocateDirect);
                i++;
            }
        }
        if (allocateDirect.position() % 56 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f15559a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
        return true;
    }

    private void a(MotionEvent motionEvent, int i, int i2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab360fd4", new Object[]{this, motionEvent, new Integer(i), new Integer(i2), byteBuffer});
        } else if (i2 == -1) {
        } else {
            byteBuffer.putLong(motionEvent.getEventTime() * 1000);
            byteBuffer.putLong(i2);
            byteBuffer.putLong(motionEvent.getPointerId(i));
            if (i == 0) {
                byteBuffer.putDouble(a(motionEvent.getRawX()));
                byteBuffer.putDouble(a(motionEvent.getRawX()));
            } else {
                byteBuffer.putDouble(a(motionEvent.getX(i)));
                byteBuffer.putDouble(a(motionEvent.getY(i)));
            }
            byteBuffer.putDouble(a(motionEvent.getX(i)));
            byteBuffer.putDouble(a(motionEvent.getY(i)));
        }
    }

    private int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue() : (int) ((f / this.b) + 0.5f);
    }
}
