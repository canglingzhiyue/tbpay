package com.taobao.android.detail.core.standard.widget.progressbar;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryFrameProgressBar extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ProgressBar mFrameProgressBar;
    private TextView mFrameTag;

    static {
        kge.a(503662248);
    }

    public PicGalleryFrameProgressBar(Context context) {
        super(context);
        init();
    }

    public PicGalleryFrameProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PicGalleryFrameProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setTagText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13745f6", new Object[]{this, str});
        } else {
            this.mFrameTag.setText(str);
        }
    }

    public void setTagColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e696bc", new Object[]{this, str});
            return;
        }
        try {
            this.mFrameTag.setTextColor(Color.parseColor(str));
        } catch (Exception unused) {
        }
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
        } else {
            this.mFrameProgressBar.setProgress(i);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        View.inflate(getContext(), R.layout.pic_gallery_frame_progress_bar, this);
        this.mFrameTag = (TextView) findViewById(R.id.frameTag);
        this.mFrameProgressBar = (ProgressBar) findViewById(R.id.frameProgressBar);
        emu.a("com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryFrameProgressBar");
    }
}
