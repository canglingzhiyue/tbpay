package tb;

import android.animation.Animator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes5.dex */
public class gmx extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CARTBUBBLEFADEANIMATION = -2394881825185657059L;
    public static final long TIME_CHECK_BUBBLE_SHOW_TIME = 3000;

    static {
        kge.a(207045846);
    }

    public static /* synthetic */ Object ipc$super(gmx gmxVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        final View v = dXRuntimeContext.v();
        if (v == null) {
            return;
        }
        long j = 3000;
        if (objArr != null) {
            try {
                j = Long.parseLong(String.valueOf(objArr[0]));
            } catch (Exception e) {
                UnifyLog.d("DXCartBubbleFadeAnimationEventHandler", "parse json error:" + e.getMessage());
            }
        }
        v.postDelayed(new Runnable() { // from class: tb.gmx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (v.getVisibility() != 0) {
                } else {
                    v.animate().alpha(0.0f).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: tb.gmx.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            v.setVisibility(8);
                            bef.b(dXRuntimeContext.m());
                        }
                    }).start();
                }
            }
        }, j);
    }
}
