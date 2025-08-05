package com.taobao.android.dinamicx.view.richtext;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeRichText extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mCheckForLongPressList;
    private boolean mHasPerformedLongPress;
    private e mRichTextRender;

    static {
        kge.a(1525068291);
    }

    public static /* synthetic */ Object ipc$super(DXNativeRichText dXNativeRichText, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$100(DXNativeRichText dXNativeRichText) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cf443f7", new Object[]{dXNativeRichText})).intValue() : dXNativeRichText.getWindowAttachCount();
    }

    public static /* synthetic */ boolean access$202(DXNativeRichText dXNativeRichText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8261fbf1", new Object[]{dXNativeRichText, new Boolean(z)})).booleanValue();
        }
        dXNativeRichText.mHasPerformedLongPress = z;
        return z;
    }

    public static /* synthetic */ int access$300(DXNativeRichText dXNativeRichText) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("44773b79", new Object[]{dXNativeRichText})).intValue() : dXNativeRichText.getWindowAttachCount();
    }

    public DXNativeRichText(Context context) {
        super(context);
        this.mHasPerformedLongPress = false;
    }

    public DXNativeRichText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHasPerformedLongPress = false;
    }

    public DXNativeRichText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHasPerformedLongPress = false;
    }

    public DXNativeRichText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHasPerformedLongPress = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!handleSpanTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        e eVar = this.mRichTextRender;
        if (eVar == null) {
            return;
        }
        eVar.a(canvas);
    }

    public boolean handleSpanTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba22d4ed", new Object[]{this, motionEvent})).booleanValue();
        }
        e eVar = this.mRichTextRender;
        if (eVar == null) {
            return false;
        }
        int a2 = eVar.a(motionEvent.getX(), motionEvent.getY());
        com.taobao.android.dinamicx.view.richtext.span.b[] bVarArr = (com.taobao.android.dinamicx.view.richtext.span.b[]) this.mRichTextRender.a(a2, a2, com.taobao.android.dinamicx.view.richtext.span.b.class);
        if (bVarArr != null) {
            z = false;
            for (com.taobao.android.dinamicx.view.richtext.span.b bVar : bVarArr) {
                z = z || bVar.a() != null;
            }
        } else {
            z = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            com.taobao.android.dinamicx.view.richtext.span.a[] aVarArr = (com.taobao.android.dinamicx.view.richtext.span.a[]) this.mRichTextRender.a(a2, a2, com.taobao.android.dinamicx.view.richtext.span.a.class);
            if (aVarArr == null || aVarArr.length == 0) {
                z2 = false;
            } else {
                z2 = false;
                for (com.taobao.android.dinamicx.view.richtext.span.a aVar : aVarArr) {
                    z2 = z2 || aVar.a() != null;
                }
                if (z2) {
                    setPressed(true);
                    checkForLongClicks(ViewConfiguration.getLongPressTimeout(), aVarArr);
                }
            }
            return z || z2;
        }
        if (action != 1) {
            if (action == 3) {
                setPressed(false);
            }
        } else if (this.mHasPerformedLongPress) {
            return true;
        } else {
            removeLongPressCallbacks();
            if (z) {
                for (com.taobao.android.dinamicx.view.richtext.span.b bVar2 : bVarArr) {
                    if (bVar2.a() != null) {
                        bVar2.onClick(this);
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void removeLongPressCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28b2c12", new Object[]{this});
            return;
        }
        a aVar = this.mCheckForLongPressList;
        if (aVar == null) {
            return;
        }
        removeCallbacks(aVar);
    }

    private void checkForLongClicks(long j, com.taobao.android.dinamicx.view.richtext.span.a[] aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5892a4", new Object[]{this, new Long(j), aVarArr});
            return;
        }
        this.mHasPerformedLongPress = false;
        this.mCheckForLongPressList = new a(aVarArr);
        this.mCheckForLongPressList.b();
        this.mCheckForLongPressList.a();
        postDelayed(this.mCheckForLongPressList, j);
    }

    /* loaded from: classes5.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private boolean c;
        private com.taobao.android.dinamicx.view.richtext.span.a[] d;

        static {
            kge.a(-125965501);
            kge.a(-1390502639);
        }

        private a(com.taobao.android.dinamicx.view.richtext.span.a[] aVarArr) {
            this.d = aVarArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c == DXNativeRichText.this.isPressed() && DXNativeRichText.this.getParent() != null && this.b == DXNativeRichText.access$100(DXNativeRichText.this)) {
                boolean z = false;
                for (com.taobao.android.dinamicx.view.richtext.span.a aVar : this.d) {
                    z = z || aVar.a(DXNativeRichText.this);
                }
                DXNativeRichText.access$202(DXNativeRichText.this, z);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b = DXNativeRichText.access$300(DXNativeRichText.this);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.c = DXNativeRichText.this.isPressed();
            }
        }
    }

    public e getRichTextRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4a24a4b7", new Object[]{this}) : this.mRichTextRender;
    }

    public void setRichTextRender(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0df203", new Object[]{this, eVar});
        } else {
            this.mRichTextRender = eVar;
        }
    }
}
