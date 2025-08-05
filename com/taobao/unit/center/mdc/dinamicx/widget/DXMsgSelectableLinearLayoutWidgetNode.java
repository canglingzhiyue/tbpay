package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeLinearLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.o;
import tb.kge;

/* loaded from: classes9.dex */
public class DXMsgSelectableLinearLayoutWidgetNode extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMSGSELECTABLELINEARLAYOUT_MSGSELECTABLELINEARLAYOUT = -3358615048808481267L;
    public static final long DXMSGSELECTABLELINEARLAYOUT_SELECTOR = 6456471229576470377L;
    private String selector = "#1A000000";

    static {
        kge.a(-2020457202);
    }

    public static /* synthetic */ Object ipc$super(DXMsgSelectableLinearLayoutWidgetNode dXMsgSelectableLinearLayoutWidgetNode, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 253729832) {
            if (hashCode == 1115049375) {
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            } else if (hashCode != 2119721610) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            }
        }
        return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
    }

    /* loaded from: classes9.dex */
    public static class Builder implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1877093861);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMsgSelectableLinearLayoutWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMsgSelectableLinearLayoutWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXMsgSelectableLinearLayoutWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.selector = ((DXMsgSelectableLinearLayoutWidgetNode) dXWidgetNode).selector;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        MsgDXNativeLinearLayout msgDXNativeLinearLayout = new MsgDXNativeLinearLayout(context);
        msgDXNativeLinearLayout.setSelector(Color.parseColor(this.selector));
        return msgDXNativeLinearLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXMSGSELECTABLELINEARLAYOUT_SELECTOR) {
            this.selector = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == DXMSGSELECTABLELINEARLAYOUT_SELECTOR ? "#1A000000" : super.getDefaultValueForStringAttr(j);
    }

    /* loaded from: classes9.dex */
    public class MsgDXNativeLinearLayout extends DXNativeLinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int foregroundColor;
        private float x;
        private float y;

        static {
            kge.a(709594981);
        }

        public static /* synthetic */ Object ipc$super(MsgDXNativeLinearLayout msgDXNativeLinearLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public MsgDXNativeLinearLayout(Context context) {
            super(context);
            this.foregroundColor = 436207616;
            this.x = -1.0f;
            this.y = -1.0f;
        }

        public MsgDXNativeLinearLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.foregroundColor = 436207616;
            this.x = -1.0f;
            this.y = -1.0f;
        }

        public MsgDXNativeLinearLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.foregroundColor = 436207616;
            this.x = -1.0f;
            this.y = -1.0f;
        }

        public void setSelector(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd14419b", new Object[]{this, new Integer(i)});
            } else {
                this.foregroundColor = i;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 0 && this.x == -1.0f && this.y == -1.0f) {
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
                if (Build.VERSION.SDK_INT >= 23) {
                    setForeground(new ColorDrawable(this.foregroundColor));
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 4) {
                reset();
            } else if (motionEvent.getAction() == 1) {
                reset();
            } else if (isMove(motionEvent)) {
                reset();
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        private void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.x = -1.0f;
            this.y = -1.0f;
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            setForeground(new ColorDrawable(0));
        }

        private boolean isMove(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d7d0abb", new Object[]{this, motionEvent})).booleanValue() : Math.abs(this.x - motionEvent.getX()) > ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop()) || Math.abs(this.y - motionEvent.getY()) > ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
        }
    }
}
