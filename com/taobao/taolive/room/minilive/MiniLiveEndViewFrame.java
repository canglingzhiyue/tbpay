package com.taobao.taolive.room.minilive;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.g;
import tb.ddw;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class MiniLiveEndViewFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String coverImg;
    public String frameContextUnique;
    private AliUrlImageView mBackground;
    private View mContainer;
    private Context mContext;
    private TextView mEndViewBtn;
    private AliUrlImageView mEndViewImg;
    private RelativeLayout mEndViewLayout;

    static {
        kge.a(-547761156);
    }

    public static /* synthetic */ AliUrlImageView access$000(MiniLiveEndViewFrame miniLiveEndViewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("ac164b90", new Object[]{miniLiveEndViewFrame}) : miniLiveEndViewFrame.mBackground;
    }

    public static /* synthetic */ Context access$100(MiniLiveEndViewFrame miniLiveEndViewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("986c37c5", new Object[]{miniLiveEndViewFrame}) : miniLiveEndViewFrame.mContext;
    }

    public MiniLiveEndViewFrame(Context context, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, null, aVar);
        this.frameContextUnique = null;
        this.mContext = context;
        if (this.mFrameContext != null) {
            this.frameContextUnique = this.mFrameContext.G();
        }
    }

    public void setCoverImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e171f", new Object[]{this, str});
            return;
        }
        this.coverImg = str;
        AliUrlImageView aliUrlImageView = this.mBackground;
        if (aliUrlImageView == null) {
            return;
        }
        g.b(str, aliUrlImageView, -1, -1, new g.a() { // from class: com.taobao.taolive.room.minilive.MiniLiveEndViewFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.utils.g.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.taolive.room.utils.g.a
            public void a(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                } else if (MiniLiveEndViewFrame.access$000(MiniLiveEndViewFrame.this) == null) {
                } else {
                    MiniLiveEndViewFrame.access$000(MiniLiveEndViewFrame.this).setImageDrawable(bitmapDrawable);
                }
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.taolive_account_end_minilive);
            this.mContainer = viewStub.inflate();
            this.mContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.taolive.room.minilive.MiniLiveEndViewFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    return true;
                }
            });
            this.mBackground = (AliUrlImageView) this.mContainer.findViewById(R.id.taolive_live_end_new_background);
            this.mBackground.setScaleType(ImageView.ScaleType.CENTER_CROP);
            setCoverImg(this.coverImg);
            this.mEndViewLayout = (RelativeLayout) this.mContainer.findViewById(R.id.taolive_live_end_new_layout);
            this.mEndViewImg = (AliUrlImageView) this.mContainer.findViewById(R.id.end_view_img);
            this.mEndViewImg.setSkipAutoSize(true);
            this.mEndViewImg.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01YDciPA1eJnvLECiOa_!!6000000003851-54-tps-111-89.apng");
            this.mEndViewBtn = (TextView) this.mContainer.findViewById(R.id.end_view_btn);
            this.mEndViewBtn.setText("观看回放");
            this.mEndViewBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.minilive.MiniLiveEndViewFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!pmd.a().a("finishActivity") || !(MiniLiveEndViewFrame.access$100(MiniLiveEndViewFrame.this) instanceof Activity)) {
                        ddw.a().a(FullScreenFrame.EVENT_ACTION_GOTO_HOME, null, MiniLiveEndViewFrame.this.frameContextUnique);
                    } else {
                        ((Activity) MiniLiveEndViewFrame.access$100(MiniLiveEndViewFrame.this)).finish();
                    }
                }
            });
            ddw.a().a("com.taobao.taolive.room.minilive.coverimg.show", null, this.frameContextUnique);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContainer = null;
        this.mBackground = null;
    }
}
