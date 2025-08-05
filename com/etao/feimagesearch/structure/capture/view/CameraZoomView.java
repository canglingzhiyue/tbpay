package com.etao.feimagesearch.structure.capture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.view.VerticalProgressBar;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.etao.feimagesearch.util.g;
import com.taobao.taobao.R;
import tb.coy;
import tb.kge;

/* loaded from: classes3.dex */
public class CameraZoomView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a callback;
    private int progress;
    private final float scale;
    private ScaleGestureDetector scaleGestureDetector;
    private VerticalProgressBar seekBar;
    private int touchY;

    /* loaded from: classes3.dex */
    public interface a {
        void a(float f);
    }

    static {
        kge.a(687934707);
    }

    public static /* synthetic */ Object ipc$super(CameraZoomView cameraZoomView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(CameraZoomView cameraZoomView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbdc755", new Object[]{cameraZoomView, context});
        } else {
            cameraZoomView.initScaleGestureDetector(context);
        }
    }

    public static /* synthetic */ a access$100(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6f6704c1", new Object[]{cameraZoomView}) : cameraZoomView.callback;
    }

    public static /* synthetic */ int access$200(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("779d46c8", new Object[]{cameraZoomView})).intValue() : cameraZoomView.touchY;
    }

    public static /* synthetic */ int access$202(CameraZoomView cameraZoomView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4e7ff7f", new Object[]{cameraZoomView, new Integer(i)})).intValue();
        }
        cameraZoomView.touchY = i;
        return i;
    }

    public static /* synthetic */ int access$300(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68eed649", new Object[]{cameraZoomView})).intValue() : cameraZoomView.progress;
    }

    public static /* synthetic */ int access$302(CameraZoomView cameraZoomView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edc8601e", new Object[]{cameraZoomView, new Integer(i)})).intValue();
        }
        cameraZoomView.progress = i;
        return i;
    }

    public static /* synthetic */ VerticalProgressBar access$400(CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerticalProgressBar) ipChange.ipc$dispatch("e4b4f88e", new Object[]{cameraZoomView}) : cameraZoomView.seekBar;
    }

    public CameraZoomView(final Context context) {
        super(context);
        this.scale = 1.0f;
        ad.c("initScaleGestureDetector", new ac() { // from class: com.etao.feimagesearch.structure.capture.view.CameraZoomView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    CameraZoomView.access$000(CameraZoomView.this, context);
                }
            }
        });
        initSeekBar(context);
    }

    public CameraZoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scale = 1.0f;
        initScaleGestureDetector(context);
        initSeekBar(context);
    }

    private void initSeekBar(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999021b6", new Object[]{this, context});
            return;
        }
        this.seekBar = new VerticalProgressBar(context);
        this.seekBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.bg_video_progress));
        this.seekBar.setVisibility(4);
        this.seekBar.setMax(100);
        this.seekBar.setProgress(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(g.a(4.0f), g.a(250.0f));
        layoutParams.addRule(15);
        layoutParams.addRule(21);
        layoutParams.rightMargin = g.a(4.0f);
        addView(this.seekBar, layoutParams);
        this.seekBar.setCallback(new VerticalProgressBar.a() { // from class: com.etao.feimagesearch.structure.capture.view.CameraZoomView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.structure.capture.view.VerticalProgressBar.a
            public void a(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                } else if (CameraZoomView.access$100(CameraZoomView.this) == null) {
                } else {
                    CameraZoomView.access$100(CameraZoomView.this).a(f);
                }
            }
        });
    }

    private void initScaleGestureDetector(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f966528c", new Object[]{this, context});
        } else {
            this.scaleGestureDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.etao.feimagesearch.structure.capture.view.CameraZoomView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                    }
                    float currentSpanY = scaleGestureDetector.getCurrentSpanY() - CameraZoomView.access$200(CameraZoomView.this);
                    CameraZoomView.access$202(CameraZoomView.this, (int) scaleGestureDetector.getCurrentSpanY());
                    CameraZoomView cameraZoomView = CameraZoomView.this;
                    CameraZoomView.access$302(cameraZoomView, (int) (CameraZoomView.access$300(cameraZoomView) + (currentSpanY * 1.0f)));
                    CameraZoomView cameraZoomView2 = CameraZoomView.this;
                    CameraZoomView.access$302(cameraZoomView2, Math.max(0, Math.min(CameraZoomView.access$300(cameraZoomView2), CameraZoomView.this.getHeight())));
                    float access$300 = (CameraZoomView.access$300(CameraZoomView.this) * 1.0f) / CameraZoomView.this.getHeight();
                    if (CameraZoomView.access$400(CameraZoomView.this) != null) {
                        CameraZoomView.access$400(CameraZoomView.this).setProgress((int) (100.0f * access$300));
                    }
                    if (CameraZoomView.access$100(CameraZoomView.this) != null) {
                        CameraZoomView.access$100(CameraZoomView.this).a(access$300);
                    }
                    return false;
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
                    }
                    CameraZoomView.access$202(CameraZoomView.this, (int) scaleGestureDetector.getCurrentSpanY());
                    if (CameraZoomView.access$400(CameraZoomView.this) != null) {
                        CameraZoomView.access$400(CameraZoomView.this).setVisibility(0);
                    }
                    coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "zoomEvent", 19999, new String[0]);
                    return true;
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                    } else if (CameraZoomView.access$400(CameraZoomView.this) == null) {
                    } else {
                        CameraZoomView.access$400(CameraZoomView.this).setVisibility(4);
                    }
                }
            });
        }
    }

    public void setCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e9bf8d", new Object[]{this, aVar});
        } else {
            this.callback = aVar;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
        if (scaleGestureDetector != null) {
            return scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return useOneFingerZoom(motionEvent);
    }

    private boolean useOneFingerZoom(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d3323b", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touchY = (int) motionEvent.getY();
        } else if (action == 2) {
            int y = (int) motionEvent.getY();
            int i = this.touchY - y;
            this.touchY = y;
            this.progress = (int) (this.progress + (i * 1.0f));
            this.progress = Math.max(0, Math.min(this.progress, getHeight()));
            a aVar = this.callback;
            if (aVar != null) {
                aVar.a((this.progress * 1.0f) / getHeight());
            }
        }
        return true;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.progress = 0;
        }
    }
}
