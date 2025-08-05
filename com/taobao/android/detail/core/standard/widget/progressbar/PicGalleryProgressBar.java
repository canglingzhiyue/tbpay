package com.taobao.android.detail.core.standard.widget.progressbar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import tb.bay;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryProgressBar extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float FRAME_PROGRESS_BAR_HORIZONTAL_SPACE = 6.0f;
    private int mFrameCount;
    private TextView mFrameDesc;
    private int mFrameIndex;
    private LinearLayout mFrameProgressBarContainer;
    private List<PicGalleryFrameProgressBar> mFrameProgressBarRecyclerPool;
    private a mProgressBarSlideListener;
    private LinearLayout mProgressBarTouchArea;
    private SeekBar mVideoProgressBar;
    private TextView mVideoProgressTimeTv;
    private long mVideoTime;
    private boolean mbContinueShowVideoProgressBarWhenTouchUp;
    private boolean mbShowVideoProgressBarWhenTouchDown;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(float f);

        void b();
    }

    static {
        kge.a(1107041687);
    }

    public static /* synthetic */ Object ipc$super(PicGalleryProgressBar picGalleryProgressBar, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(PicGalleryProgressBar picGalleryProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f2389b3", new Object[]{picGalleryProgressBar})).booleanValue() : picGalleryProgressBar.mbShowVideoProgressBarWhenTouchDown;
    }

    public static /* synthetic */ a access$100(PicGalleryProgressBar picGalleryProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("da451dc1", new Object[]{picGalleryProgressBar}) : picGalleryProgressBar.mProgressBarSlideListener;
    }

    public static /* synthetic */ LinearLayout access$200(PicGalleryProgressBar picGalleryProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("a2a18188", new Object[]{picGalleryProgressBar}) : picGalleryProgressBar.mProgressBarTouchArea;
    }

    public static /* synthetic */ LinearLayout access$300(PicGalleryProgressBar picGalleryProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("ef4fab09", new Object[]{picGalleryProgressBar}) : picGalleryProgressBar.mFrameProgressBarContainer;
    }

    public static /* synthetic */ SeekBar access$400(PicGalleryProgressBar picGalleryProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SeekBar) ipChange.ipc$dispatch("1cf34d42", new Object[]{picGalleryProgressBar}) : picGalleryProgressBar.mVideoProgressBar;
    }

    public static /* synthetic */ boolean access$500(PicGalleryProgressBar picGalleryProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc4a62b8", new Object[]{picGalleryProgressBar})).booleanValue() : picGalleryProgressBar.mbContinueShowVideoProgressBarWhenTouchUp;
    }

    public static /* synthetic */ int access$600(PicGalleryProgressBar picGalleryProgressBar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4f341e1", new Object[]{picGalleryProgressBar, new Integer(i)})).intValue() : picGalleryProgressBar.calculateFrameProgressBarWidth(i);
    }

    public PicGalleryProgressBar(Context context) {
        super(context);
        this.mFrameProgressBarRecyclerPool = new ArrayList();
        init();
    }

    public PicGalleryProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFrameProgressBarRecyclerPool = new ArrayList();
        init();
    }

    public PicGalleryProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFrameProgressBarRecyclerPool = new ArrayList();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        View.inflate(getContext(), R.layout.pic_gallery_progress_bar, this);
        this.mFrameProgressBarContainer = (LinearLayout) findViewById(R.id.frameProgressBarContainer);
        this.mVideoProgressBar = (SeekBar) findViewById(R.id.videoProgressBar);
        this.mProgressBarTouchArea = (LinearLayout) findViewById(R.id.progressBarTouchArea);
        this.mVideoProgressTimeTv = (TextView) findViewById(R.id.videoProgressTimeTv);
        this.mFrameDesc = (TextView) findViewById(R.id.tv_frame_desc);
        emu.a("com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar");
        this.mProgressBarTouchArea.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction() & 255;
                if (action == 0) {
                    if (PicGalleryProgressBar.access$000(PicGalleryProgressBar.this)) {
                        PicGalleryProgressBar.this.showVideoProgress();
                    }
                    if (PicGalleryProgressBar.access$100(PicGalleryProgressBar.this) != null) {
                        PicGalleryProgressBar.access$100(PicGalleryProgressBar.this).a();
                    }
                } else if (action == 1) {
                    if (PicGalleryProgressBar.access$100(PicGalleryProgressBar.this) != null) {
                        PicGalleryProgressBar.access$100(PicGalleryProgressBar.this).b();
                    }
                    if (PicGalleryProgressBar.access$500(PicGalleryProgressBar.this)) {
                        PicGalleryProgressBar.this.showVideoProgress();
                    } else {
                        PicGalleryProgressBar.this.showFrameProgress();
                    }
                    PicGalleryProgressBar.access$200(PicGalleryProgressBar.this).requestDisallowInterceptTouchEvent(true);
                } else if (action == 2) {
                    float f = 0.0f;
                    if (motionEvent.getX() >= 0.0f) {
                        f = motionEvent.getX();
                    }
                    float width = PicGalleryProgressBar.access$200(PicGalleryProgressBar.this).getWidth();
                    if (PicGalleryProgressBar.access$300(PicGalleryProgressBar.this).getVisibility() != 0 && PicGalleryProgressBar.access$400(PicGalleryProgressBar.this).getVisibility() == 0) {
                        float f2 = f / width;
                        PicGalleryProgressBar.this.setVideoProgress(f2);
                        if (PicGalleryProgressBar.access$100(PicGalleryProgressBar.this) != null) {
                            PicGalleryProgressBar.access$100(PicGalleryProgressBar.this).a(f2);
                        }
                    }
                }
                return true;
            }
        });
    }

    public void showFrameDesc(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8faaf2", new Object[]{this, str});
            return;
        }
        this.mFrameDesc.setText(str);
        TextView textView = this.mFrameDesc;
        if (TextUtils.isEmpty(str)) {
            i = 4;
        }
        textView.setVisibility(i);
    }

    public void showFrameProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564fc8c4", new Object[]{this});
            return;
        }
        this.mFrameProgressBarContainer.setVisibility(0);
        this.mVideoProgressBar.setVisibility(4);
        this.mVideoProgressTimeTv.setVisibility(4);
    }

    public void showVideoProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28f0ed2", new Object[]{this});
            return;
        }
        this.mFrameProgressBarContainer.setVisibility(4);
        this.mVideoProgressBar.setVisibility(0);
        this.mVideoProgressTimeTv.setVisibility(0);
    }

    public void setFrameCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18354c38", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.mFrameCount = i;
            recyclerFrameProgressBar();
            this.mFrameProgressBarContainer.removeAllViews();
            int calculateFrameProgressBarWidth = calculateFrameProgressBarWidth(i);
            for (int i2 = 0; i2 < i; i2++) {
                PicGalleryFrameProgressBar generateFrameProgressBar = generateFrameProgressBar();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(calculateFrameProgressBarWidth, -2);
                if (i2 == 0) {
                    layoutParams.leftMargin = 0;
                } else {
                    layoutParams.leftMargin = bay.a((float) FRAME_PROGRESS_BAR_HORIZONTAL_SPACE);
                }
                layoutParams.gravity = 16;
                generateFrameProgressBar.setLayoutParams(layoutParams);
                this.mFrameProgressBarContainer.addView(generateFrameProgressBar);
            }
            if (calculateFrameProgressBarWidth != 0) {
                return;
            }
            postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PicGalleryProgressBar picGalleryProgressBar = PicGalleryProgressBar.this;
                    int access$600 = PicGalleryProgressBar.access$600(picGalleryProgressBar, PicGalleryProgressBar.access$300(picGalleryProgressBar).getChildCount());
                    for (int i3 = 0; i3 < PicGalleryProgressBar.access$300(PicGalleryProgressBar.this).getChildCount(); i3++) {
                        View childAt = PicGalleryProgressBar.access$300(PicGalleryProgressBar.this).getChildAt(i3);
                        if (childAt instanceof PicGalleryFrameProgressBar) {
                            PicGalleryFrameProgressBar picGalleryFrameProgressBar = (PicGalleryFrameProgressBar) childAt;
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) picGalleryFrameProgressBar.getLayoutParams();
                            layoutParams2.width = access$600;
                            picGalleryFrameProgressBar.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }, 1L);
        }
    }

    public void setFrameIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8270d655", new Object[]{this, new Integer(i)});
        } else {
            this.mFrameIndex = i;
        }
    }

    public int getFrameIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b368255", new Object[]{this})).intValue() : this.mFrameIndex;
    }

    public void setFrameProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad7e9a1", new Object[]{this, new Float(f)});
            return;
        }
        int i = (int) f;
        for (int i2 = 0; i2 < this.mFrameProgressBarContainer.getChildCount(); i2++) {
            View childAt = this.mFrameProgressBarContainer.getChildAt(i2);
            if (childAt instanceof PicGalleryFrameProgressBar) {
                PicGalleryFrameProgressBar picGalleryFrameProgressBar = (PicGalleryFrameProgressBar) childAt;
                if (i2 < i) {
                    picGalleryFrameProgressBar.setProgress(100);
                } else if (i2 == i) {
                    picGalleryFrameProgressBar.setProgress((int) ((f - i) * 100.0f));
                } else {
                    picGalleryFrameProgressBar.setProgress(0);
                }
            }
        }
    }

    public void setFrameTagText(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6455d67c", new Object[]{this, strArr});
            return;
        }
        for (int i = 0; i < this.mFrameProgressBarContainer.getChildCount(); i++) {
            View childAt = this.mFrameProgressBarContainer.getChildAt(i);
            if (childAt instanceof PicGalleryFrameProgressBar) {
                PicGalleryFrameProgressBar picGalleryFrameProgressBar = (PicGalleryFrameProgressBar) childAt;
                if (strArr == null || i >= strArr.length) {
                    picGalleryFrameProgressBar.setTagText("");
                } else {
                    picGalleryFrameProgressBar.setTagText(strArr[i]);
                }
            }
        }
    }

    public void setFrameTagColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95abbca8", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.mFrameProgressBarContainer.getChildCount(); i2++) {
            View childAt = this.mFrameProgressBarContainer.getChildAt(i2);
            if (childAt instanceof PicGalleryFrameProgressBar) {
                ((PicGalleryFrameProgressBar) childAt).setTagColor("#FFFFFF");
            }
        }
    }

    public void setVideoProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36816553", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.mVideoProgressBar.setProgress((int) (100.0f * f));
        if (this.mVideoProgressTimeTv.getVisibility() != 0) {
            return;
        }
        long j = this.mVideoTime;
        int i = (int) (j / 3600000);
        int i2 = (int) ((j % 3600000) / 60000);
        int i3 = (int) ((j % 60000) / 1000);
        long j2 = f * ((float) j);
        int i4 = (int) (j2 / 3600000);
        int i5 = (int) ((j2 % 3600000) / 60000);
        int i6 = (int) ((j2 % 60000) / 1000);
        DecimalFormat decimalFormat = new DecimalFormat("00");
        StringBuffer stringBuffer = new StringBuffer();
        if (i4 > 0) {
            stringBuffer.append(i4);
            stringBuffer.append(":");
        }
        stringBuffer.append(decimalFormat.format(i5));
        stringBuffer.append(":");
        stringBuffer.append(decimalFormat.format(i6));
        stringBuffer.append(" / ");
        if (i > 0) {
            stringBuffer.append(i);
            stringBuffer.append(":");
        }
        stringBuffer.append(decimalFormat.format(i2));
        stringBuffer.append(":");
        stringBuffer.append(decimalFormat.format(i3));
        this.mVideoProgressTimeTv.setText(stringBuffer.toString());
    }

    public void setVideoTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ca0337", new Object[]{this, new Long(j)});
        } else {
            this.mVideoTime = j;
        }
    }

    public long getVideoTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("319332ad", new Object[]{this})).longValue() : this.mVideoTime;
    }

    public void setShowVideoProgressBarWhenTouchDown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7567fe90", new Object[]{this, new Boolean(z)});
        } else {
            this.mbShowVideoProgressBarWhenTouchDown = z;
        }
    }

    public void setContinueShowVideoProgressBarWhenTouchUp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2eccbe", new Object[]{this, new Boolean(z)});
        } else {
            this.mbContinueShowVideoProgressBarWhenTouchUp = z;
        }
    }

    public void setProgressBarSlideListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedf2323", new Object[]{this, aVar});
        } else {
            this.mProgressBarSlideListener = aVar;
        }
    }

    private PicGalleryFrameProgressBar generateFrameProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PicGalleryFrameProgressBar) ipChange.ipc$dispatch("13c0e85e", new Object[]{this});
        }
        if (!this.mFrameProgressBarRecyclerPool.isEmpty()) {
            PicGalleryFrameProgressBar picGalleryFrameProgressBar = this.mFrameProgressBarRecyclerPool.get(0);
            this.mFrameProgressBarRecyclerPool.remove(0);
            return picGalleryFrameProgressBar;
        }
        return new PicGalleryFrameProgressBar(getContext());
    }

    private void recyclerFrameProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa301ddf", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mFrameProgressBarContainer.getChildCount(); i++) {
            View childAt = this.mFrameProgressBarContainer.getChildAt(i);
            if (childAt instanceof PicGalleryFrameProgressBar) {
                PicGalleryFrameProgressBar picGalleryFrameProgressBar = (PicGalleryFrameProgressBar) childAt;
                this.mFrameProgressBarRecyclerPool.add(picGalleryFrameProgressBar);
                picGalleryFrameProgressBar.setProgress(0);
            }
        }
    }

    private int calculateFrameProgressBarWidth(int i) {
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53490128", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i <= 0 || (width = (this.mFrameProgressBarContainer.getWidth() - ((i - 1) * bay.a((float) FRAME_PROGRESS_BAR_HORIZONTAL_SPACE))) / i) < 0) {
            return 0;
        }
        return width;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
        } else if (getVisibility() == i) {
        } else {
            if (i != 0) {
                z = false;
            }
            if (!z) {
                super.setVisibility(i);
                return;
            }
            float f = 0.0f;
            float f2 = z ? 0.0f : 1.0f;
            if (z) {
                f = 1.0f;
            }
            super.setVisibility(i);
            AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
            alphaAnimation.setDuration(200L);
            startAnimation(alphaAnimation);
        }
    }
}
