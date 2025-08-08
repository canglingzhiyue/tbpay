package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.os.Environment;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.g;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.android.detail.ttdetail.widget.desc.image.i;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.a;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class GalleryPopupWindow extends PopupWindow implements ViewPager.OnPageChangeListener, CustomViewPager.a, a.InterfaceC0435a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String DEFAULT_APP_PIC_DIR_PATH = null;
    public static final String TAG = "GalleryPopupWindow";
    private Dialog dialog;
    private boolean fromDetailMain;
    private c galleryDTO;
    private int imageOffset;
    private Application mApp;
    private GalleryViewPager mBigGallery;
    private a mBigGalleryAdapter;
    private View mContainer;
    private Context mContext;
    private IndexView mIndexView;
    private int mLastIndex;
    private View mSubDescContainer;
    private SystemBarDecorator mSystemBarDecorator;
    private TextView mTvDesc;
    private TextView mTvSubDesc;
    private boolean needVideoAutoPlay;
    private boolean supportLongPress;
    private int totalPages;
    private HashMap<String, String> utParams;
    private int videoCurrentPosition;

    static {
        kge.a(-169853429);
        kge.a(-778180868);
        kge.a(1848919473);
        kge.a(-1694148257);
        kge.a(-678373262);
    }

    public static /* synthetic */ Object ipc$super(GalleryPopupWindow galleryPopupWindow, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode != -742181306) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.isShowing());
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager.a
    public void onPageFirstScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20337d3", new Object[]{this});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b66c3bb", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.dismissPopup();
        }
    }

    public static /* synthetic */ a access$100(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9eab29c1", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mBigGalleryAdapter;
    }

    public static /* synthetic */ boolean access$1000(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb727aae", new Object[]{galleryPopupWindow})).booleanValue() : galleryPopupWindow.needVideoAutoPlay;
    }

    public static /* synthetic */ boolean access$1002(GalleryPopupWindow galleryPopupWindow, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42dc4a2c", new Object[]{galleryPopupWindow, new Boolean(z)})).booleanValue();
        }
        galleryPopupWindow.needVideoAutoPlay = z;
        return z;
    }

    public static /* synthetic */ int access$1300(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e337c320", new Object[]{galleryPopupWindow})).intValue() : galleryPopupWindow.imageOffset;
    }

    public static /* synthetic */ void access$1400(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2430ae", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.dismissGalleryPopupWindow();
        }
    }

    public static /* synthetic */ boolean access$1500(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53109e33", new Object[]{galleryPopupWindow})).booleanValue() : galleryPopupWindow.supportLongPress;
    }

    public static /* synthetic */ int access$1600(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("afd0ba3", new Object[]{galleryPopupWindow})).intValue() : galleryPopupWindow.videoCurrentPosition;
    }

    public static /* synthetic */ int access$1602(GalleryPopupWindow galleryPopupWindow, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4a39a04", new Object[]{galleryPopupWindow, new Integer(i)})).intValue();
        }
        galleryPopupWindow.videoCurrentPosition = i;
        return i;
    }

    public static /* synthetic */ boolean access$300(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("432c0c42", new Object[]{galleryPopupWindow})).booleanValue() : galleryPopupWindow.fromDetailMain;
    }

    public static /* synthetic */ c access$400(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e805134e", new Object[]{galleryPopupWindow}) : galleryPopupWindow.galleryDTO;
    }

    public static /* synthetic */ SystemBarDecorator access$500(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SystemBarDecorator) ipChange.ipc$dispatch("593ea9c1", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mSystemBarDecorator;
    }

    public static /* synthetic */ Context access$600(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("49abc0b9", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mContext;
    }

    public static /* synthetic */ int access$700(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22ddc235", new Object[]{galleryPopupWindow})).intValue() : galleryPopupWindow.getStatusBarHeight();
    }

    public static /* synthetic */ HashMap access$800(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("baa01a66", new Object[]{galleryPopupWindow}) : galleryPopupWindow.utParams;
    }

    public static /* synthetic */ IndexView access$900(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndexView) ipChange.ipc$dispatch("816252bf", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mIndexView;
    }

    public GalleryPopupWindow(View view, int i, int i2, Context context) {
        super(view, i, i2);
        this.mLastIndex = 0;
        this.mContext = context;
        Context context2 = this.mContext;
        if (context2 instanceof Activity) {
            this.mSystemBarDecorator = new SystemBarDecorator((Activity) context2);
        }
        this.mApp = odg.b().a();
        DEFAULT_APP_PIC_DIR_PATH = getPicDir(this.mApp);
        this.mContainer = view;
        this.needVideoAutoPlay = false;
        init();
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                GalleryPopupWindow.access$000(GalleryPopupWindow.this);
                if (a.a(GalleryPopupWindow.access$100(GalleryPopupWindow.this)) != null && a.a(GalleryPopupWindow.access$100(GalleryPopupWindow.this)).isFullScreen()) {
                    a.a(GalleryPopupWindow.access$100(GalleryPopupWindow.this)).toggleScreen();
                }
                if (GalleryPopupWindow.access$300(GalleryPopupWindow.this)) {
                    d dVar = new d();
                    dVar.f11019a = GalleryPopupWindow.this.getCurrentIndex();
                    if (dVar.f11019a < GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.size()) {
                        dVar.b = GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.get(dVar.f11019a);
                    }
                }
                if (GalleryPopupWindow.access$500(GalleryPopupWindow.this) != null) {
                    GalleryPopupWindow.access$500(GalleryPopupWindow.this).setStatusBarColor("#00000000", false);
                }
                GalleryPopupWindow.this.stop();
            }
        });
    }

    @Override // android.widget.PopupWindow
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : super.isShowing();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            super.dismiss();
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setFocusable(true);
        setBackgroundDrawable(new PaintDrawable());
        setAnimationStyle(16973826);
        setSoftInputMode(16);
        this.mIndexView = (IndexView) this.mContainer.findViewById(R.id.index_image_viewer);
        this.mBigGallery = (GalleryViewPager) this.mContainer.findViewById(R.id.big_gallery);
        this.mTvDesc = (TextView) this.mContainer.findViewById(R.id.tv_image_desc);
        this.mTvSubDesc = (TextView) this.mContainer.findViewById(R.id.tv_image_sub_desc);
        this.mSubDescContainer = this.mContainer.findViewById(R.id.ll_sub_img_desc);
        this.mBigGallery.setOffscreenPageLimit(0);
        this.mBigGallery.setOnPageChangeListener(this);
        this.mBigGallery.setOnPageEdgeScrollLimitListener(this);
    }

    public void setBigImgUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b12430", new Object[]{this});
            return;
        }
        a aVar = this.mBigGalleryAdapter;
        if (aVar == null) {
            this.mBigGalleryAdapter = new a();
            this.mBigGalleryAdapter.a(this);
            this.mBigGallery.setAdapter(this.mBigGalleryAdapter);
            return;
        }
        aVar.notifyDataSetChanged();
    }

    public void showGalleryDialog(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ae8cdb", new Object[]{this, cVar});
        } else if (cVar == null || cVar.e == null || cVar.e.isEmpty()) {
        } else {
            this.galleryDTO = cVar;
            if (this.galleryDTO.m) {
                this.needVideoAutoPlay = this.galleryDTO.m;
            }
            this.supportLongPress = cVar.f11018a;
            this.fromDetailMain = cVar.b;
            this.imageOffset = !StringUtils.isEmpty(this.galleryDTO.j) ? 1 : 0;
            this.totalPages = this.galleryDTO.e.size() + this.imageOffset;
            processBigImageUrl(this.galleryDTO);
            if (this.galleryDTO.d == null || this.galleryDTO.d.isEmpty()) {
                return;
            }
            setBigImgUrls();
            showGalleryDialog(this.galleryDTO.c, this.galleryDTO.f);
        }
    }

    public ArrayList<String> processBigImageUrl(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f0867c2d", new Object[]{this, cVar});
        }
        if (cVar.d != null) {
            return cVar.d;
        }
        cVar.d = new ArrayList<>();
        Iterator<String> it = cVar.e.iterator();
        while (it.hasNext()) {
            cVar.d.add(standardUrl(it.next()));
        }
        return cVar.d;
    }

    private String standardUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa70d87d", new Object[]{this, str});
        }
        int indexOf = str.indexOf(".jpg");
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf) + ".jpg";
    }

    private void showGalleryDialog(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53603033", new Object[]{this, new Integer(i), view});
            return;
        }
        this.mBigGallery.setCurrentItem(i);
        changeIndexPos(i);
        if (!isShowing()) {
            SystemBarDecorator systemBarDecorator = this.mSystemBarDecorator;
            if (systemBarDecorator != null) {
                systemBarDecorator.setStatusBarColor("#000000");
            }
            try {
                showAtLocation(view, 0, 0, 0);
                update();
                setFocusable(true);
            } catch (Throwable unused) {
            }
        }
        this.mBigGalleryAdapter.notifyDataSetChanged();
        resume();
    }

    /* loaded from: classes5.dex */
    public class a extends com.taobao.android.detail.ttdetail.widget.desc.picgallery.a implements av {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View d;
        private bk e;
        private ImageView f;
        private DetailImageView g;

        static {
            kge.a(-2131275873);
            kge.a(688755897);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2093417530) {
                super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.avplayer.av
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        public a() {
        }

        public static /* synthetic */ bk a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("9fda7ee7", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ bk a(a aVar, bk bkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bk) ipChange.ipc$dispatch("edcdca27", new Object[]{aVar, bkVar});
            }
            aVar.e = bkVar;
            return bkVar;
        }

        public static /* synthetic */ ImageView b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("db9de000", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ DetailImageView c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("7d800bbf", new Object[]{aVar}) : aVar.g;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.a, android.support.v4.view.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            super.setPrimaryItem(viewGroup, i, obj);
            if (obj instanceof TouchImageView) {
                ((GalleryViewPager) viewGroup).mCurrentView = (TouchImageView) obj;
            } else {
                ((GalleryViewPager) viewGroup).mCurrentView = null;
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (GalleryPopupWindow.access$400(GalleryPopupWindow.this).d == null || GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.isEmpty()) {
                return 0;
            }
            if (StringUtils.isEmpty(GalleryPopupWindow.access$400(GalleryPopupWindow.this).j)) {
                return GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.size() + (GalleryPopupWindow.access$300(GalleryPopupWindow.this) ? 1 : 0);
            }
            return GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.size() + (GalleryPopupWindow.access$300(GalleryPopupWindow.this) ? 1 : 0) + 1;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (i == 0 && !StringUtils.isEmpty(GalleryPopupWindow.access$400(GalleryPopupWindow.this).k) && !StringUtils.isEmpty(GalleryPopupWindow.access$400(GalleryPopupWindow.this).l)) {
                if (this.e == null && (GalleryPopupWindow.access$600(GalleryPopupWindow.this) instanceof Activity)) {
                    bk.a aVar = new bk.a((Activity) GalleryPopupWindow.access$600(GalleryPopupWindow.this));
                    aVar.e("DETAILMAIN");
                    aVar.c("TBVideo");
                    aVar.f(false);
                    aVar.q(true);
                    aVar.g(false);
                    aVar.a(GalleryPopupWindow.access$400(GalleryPopupWindow.this).k);
                    aVar.n(false);
                    aVar.c(f.a(GalleryPopupWindow.access$600(GalleryPopupWindow.this)));
                    aVar.d(f.b(GalleryPopupWindow.access$600(GalleryPopupWindow.this)) - GalleryPopupWindow.access$700(GalleryPopupWindow.this));
                    aVar.a(GalleryPopupWindow.access$800(GalleryPopupWindow.this));
                    this.e = aVar.c();
                    this.e.setVideoLifecycleListener(this);
                    this.e.hideCloseView();
                    GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                }
                bk bkVar = this.e;
                if (bkVar != null && bkVar.getView().getParent() != null) {
                    ((ViewGroup) this.e.getView().getParent()).removeView(this.e.getView());
                }
                viewGroup.addView(this.e.getView(), 0);
                if (this.g == null) {
                    this.g = a(GalleryPopupWindow.access$400(GalleryPopupWindow.this).l);
                    this.g.setVisibility(0);
                }
                if (this.g.getParent() != null) {
                    ((ViewGroup) this.g.getParent()).removeView(this.g);
                }
                this.e.addCoverView(this.g, new FrameLayout.LayoutParams(-1, -1));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                layoutParams.width = (int) GalleryPopupWindow.access$600(GalleryPopupWindow.this).getResources().getDimension(R.dimen.tt_detail_video_play_btn_width);
                layoutParams.height = (int) GalleryPopupWindow.access$600(GalleryPopupWindow.this).getResources().getDimension(R.dimen.tt_detail_video_play_btn_height);
                if (this.f == null) {
                    this.f = new ImageView(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
                    this.f.setLayoutParams(layoutParams);
                    this.f.setImageResource(R.drawable.tt_detail_video_play);
                    this.f.setVisibility(0);
                    this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
                            a.b(a.this).setVisibility(4);
                            a.c(a.this).setVisibility(4);
                            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                            int videoState = a.a(a.this).getVideoState();
                            if (videoState == 4 || videoState == 2 || videoState == 6) {
                                a.a(a.this).playVideo();
                            } else {
                                a.a(a.this).start();
                            }
                        }
                    });
                }
                if (this.f.getParent() != null) {
                    ((ViewGroup) this.f.getParent()).removeView(this.f);
                }
                this.e.addCoverView(this.f, layoutParams);
                if (GalleryPopupWindow.access$1000(GalleryPopupWindow.this)) {
                    GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                    this.f.setVisibility(4);
                    this.g.setVisibility(4);
                    this.e.start();
                } else {
                    GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
                    this.f.setVisibility(0);
                    this.g.setVisibility(0);
                }
                return this.e.getView();
            }
            int access$1300 = i - GalleryPopupWindow.access$1300(GalleryPopupWindow.this);
            if (GalleryPopupWindow.access$300(GalleryPopupWindow.this) && access$1300 >= GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.size()) {
                if (this.d == null) {
                    this.d = LayoutInflater.from(GalleryPopupWindow.access$600(GalleryPopupWindow.this)).inflate(R.layout.tt_detail_main_gallery_scroll_limit_tip_blackbg, (ViewGroup) null);
                    this.d.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                }
                viewGroup.addView(this.d, 0);
                return this.d;
            }
            String str = GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.get(access$1300);
            TouchImageView touchImageView = new TouchImageView(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
            touchImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            touchImageView.setContentDescription(GalleryPopupWindow.access$600(GalleryPopupWindow.this).getString(R.string.tt_detail_content_description_pic));
            touchImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        GalleryPopupWindow.access$1400(GalleryPopupWindow.this);
                    }
                }
            });
            touchImageView.setOnLongClickListener(new View$OnLongClickListenerC0434a(touchImageView, str));
            com.taobao.android.detail.ttdetail.widget.desc.image.d a2 = new d.a().b(R.drawable.tt_detail_img_load_fail).b(ImageView.ScaleType.CENTER_INSIDE).c(touchImageView.getScaleType()).c(f.a(GalleryPopupWindow.access$600(GalleryPopupWindow.this))).d(f.b(GalleryPopupWindow.access$600(GalleryPopupWindow.this))).a();
            i a3 = i.a();
            if (a3 != null) {
                try {
                    a3.a(str, touchImageView, a2);
                } catch (Throwable unused) {
                }
            }
            viewGroup.addView(touchImageView, 0);
            return touchImageView;
        }

        /* renamed from: com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class View$OnLongClickListenerC0434a implements View.OnLongClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private TouchImageView b;
            private String c;

            static {
                kge.a(1379178474);
                kge.a(1426707756);
            }

            public View$OnLongClickListenerC0434a(TouchImageView touchImageView, String str) {
                this.b = touchImageView;
                this.c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (this.b == null || !GalleryPopupWindow.access$1500(GalleryPopupWindow.this) || this.b.isZoomState() || odg.o().a()) {
                    return false;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("share_businessId", (Object) "picture-desc");
                jSONObject.put("share_imageUrl", (Object) this.c);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("detailShareParams", (Object) jSONObject);
                com.taobao.android.detail.ttdetail.communication.c.a(GalleryPopupWindow.access$600(GalleryPopupWindow.this), new h("share", jSONObject2, new RuntimeAbilityParam[0]));
                return false;
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.a, android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (obj == null) {
            } else {
                i a2 = i.a();
                if (a2 != null && (obj instanceof ImageView)) {
                    a2.a((String) null, (DetailImageView) obj);
                }
                if (i == 0 && !StringUtils.isEmpty(GalleryPopupWindow.access$400(GalleryPopupWindow.this).k) && !StringUtils.isEmpty(GalleryPopupWindow.access$400(GalleryPopupWindow.this).l)) {
                    bk bkVar = this.e;
                    if (bkVar != null) {
                        bkVar.removeCoverView(this.g);
                        this.e.removeCoverView(this.f);
                        if (this.e.getVideoState() == 1) {
                            GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
                        }
                        GalleryPopupWindow.access$1602(GalleryPopupWindow.this, this.e.getCurrentPosition());
                        viewGroup.removeView(this.e.getView());
                        this.e.destroy();
                    }
                    this.e = null;
                    return;
                }
                if (obj instanceof TouchImageView) {
                    ((TouchImageView) obj).destroy();
                }
                if (viewGroup == null) {
                    return;
                }
                viewGroup.removeView((View) obj);
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoStart");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.g.setVisibility(4);
            this.f.setVisibility(4);
            if (GalleryPopupWindow.access$1600(GalleryPopupWindow.this) <= 0) {
                return;
            }
            this.e.seekTo(GalleryPopupWindow.access$1600(GalleryPopupWindow.this));
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoPause");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.g.setVisibility(4);
            this.f.setVisibility(4);
            if (z) {
                GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
            }
            GalleryPopupWindow.access$1602(GalleryPopupWindow.this, this.e.getCurrentPosition());
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoPlay");
            GalleryPopupWindow.access$1002(GalleryPopupWindow.this, false);
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.g.setVisibility(4);
            this.f.setVisibility(4);
            this.e.showController();
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoPrepared");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.g.setVisibility(0);
            this.f.setVisibility(0);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoComplete");
            if (!this.e.isFullScreen()) {
                GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
            }
            this.g.setVisibility(0);
            this.f.setVisibility(0);
            GalleryPopupWindow.access$1602(GalleryPopupWindow.this, 0);
            GalleryPopupWindow.access$1002(GalleryPopupWindow.this, false);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoClose");
            this.g.setVisibility(0);
            this.f.setVisibility(0);
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
            GalleryPopupWindow.access$1602(GalleryPopupWindow.this, this.e.getCurrentPosition());
        }

        @Override // com.taobao.avplayer.av
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoFullScreen");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.g.getLayoutParams().width = f.a(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
            this.g.getLayoutParams().height = f.b(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
        }

        @Override // com.taobao.avplayer.av
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "onVideoNormalScreen");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
            this.g.getLayoutParams().width = f.a(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
        }

        private DetailImageView a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailImageView) ipChange.ipc$dispatch("909b433e", new Object[]{this, str});
            }
            DetailImageView detailImageView = new DetailImageView(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.height = this.e.getView().getLayoutParams().height;
            layoutParams.width = this.e.getView().getLayoutParams().width;
            detailImageView.setLayoutParams(layoutParams);
            detailImageView.setContentDescription(GalleryPopupWindow.access$600(GalleryPopupWindow.this).getString(R.string.tt_detail_content_description_pic));
            detailImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
                    a.b(a.this).setVisibility(4);
                    a.c(a.this).setVisibility(4);
                    GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                    int videoState = a.a(a.this).getVideoState();
                    if (videoState == 2 || videoState == 4 || videoState == 6) {
                        a.a(a.this).playVideo();
                    } else {
                        a.a(a.this).start();
                    }
                }
            });
            detailImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    return false;
                }
            });
            com.taobao.android.detail.ttdetail.widget.desc.image.d a2 = new d.a().b(R.drawable.tt_detail_img_load_fail).b(ImageView.ScaleType.CENTER_INSIDE).c(detailImageView.getScaleType()).a();
            i a3 = i.a();
            if (a3 != null) {
                try {
                    a3.a(str, detailImageView, a2);
                } catch (Throwable unused) {
                }
            }
            return detailImageView;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.a.InterfaceC0435a
    public void onItemChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb11cba", new Object[]{this, new Integer(i)});
            return;
        }
        changeIndexPos(i);
        if (i != 0 || a.a(this.mBigGalleryAdapter) == null || StringUtils.isEmpty(this.galleryDTO.k) || StringUtils.isEmpty(this.galleryDTO.l)) {
            return;
        }
        g.a(this.mContext, this.galleryDTO.n, this.galleryDTO.o, null);
    }

    private void changeIndexPos(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1a56aa", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.galleryDTO;
        if (cVar == null || cVar.d == null) {
            return;
        }
        if (i < this.totalPages) {
            this.mLastIndex = i;
        }
        this.mIndexView.setTotalCount(this.totalPages);
        if (this.totalPages < 2) {
            this.mIndexView.setVisibility(8);
        }
        if (i == 0 && a.a(this.mBigGalleryAdapter) != null && (a.a(this.mBigGalleryAdapter).getVideoState() == 1 || a.a(this.mBigGalleryAdapter).getVideoState() == 2 || a.a(this.mBigGalleryAdapter).getVideoState() == 5)) {
            this.mIndexView.setVisibility(8);
        } else {
            this.mIndexView.setVisibility(0);
        }
        this.mIndexView.setSelectedIndex(i);
        int size = this.galleryDTO.d.size();
        int i2 = i - this.imageOffset;
        String str2 = null;
        if (i2 < 0 || i2 >= size) {
            str = null;
        } else {
            String str3 = this.galleryDTO.e.get(i2);
            str = this.galleryDTO.h == null ? null : this.galleryDTO.h.get(str3);
            if (this.galleryDTO.i != null) {
                str2 = this.galleryDTO.i.get(str3);
            }
        }
        if (!StringUtils.isEmpty(str)) {
            this.mTvDesc.setText(str);
            this.mTvDesc.setVisibility(0);
        } else {
            this.mTvDesc.setVisibility(8);
        }
        if (!StringUtils.isEmpty(str2)) {
            this.mTvSubDesc.setText(str2);
            this.mSubDescContainer.setVisibility(0);
            return;
        }
        this.mSubDescContainer.setVisibility(8);
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        int i = this.mLastIndex;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public int getCurrentImageIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce519554", new Object[]{this})).intValue() : this.mLastIndex - this.imageOffset;
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        a aVar = this.mBigGalleryAdapter;
        if (aVar == null || a.a(aVar) == null) {
            return;
        }
        a.a(this.mBigGalleryAdapter).closeVideo();
        a.a(this.mBigGalleryAdapter).destroy();
        a.a(this.mBigGalleryAdapter, null);
        this.mBigGalleryAdapter = null;
    }

    private void reviewBitImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d88114d", new Object[]{this});
            return;
        }
        int currentImageIndex = getCurrentImageIndex();
        this.galleryDTO.d.set(currentImageIndex, this.galleryDTO.e.get(currentImageIndex));
        a aVar = this.mBigGalleryAdapter;
        if (aVar == null) {
            return;
        }
        aVar.notifyDataSetChanged();
    }

    public boolean onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2372e0f1", new Object[]{this})).booleanValue();
        }
        if (!isShowing()) {
            return false;
        }
        pause();
        try {
            dismiss();
        } catch (Exception unused) {
        }
        return true;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mApp = null;
        this.mContainer = null;
        GalleryViewPager galleryViewPager = this.mBigGallery;
        if (galleryViewPager == null) {
            return;
        }
        galleryViewPager.setAdapter(null);
        this.mBigGallery.setOnPageChangeListener(null);
        this.mBigGallery.setOnPageEdgeScrollLimitListener(null);
        this.mBigGallery = null;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if ((i == 0 && !StringUtils.isEmpty(this.galleryDTO.j)) || i != 0 || StringUtils.isEmpty(this.galleryDTO.k) || a.a(this.mBigGalleryAdapter) == null) {
        } else {
            int videoState = a.a(this.mBigGalleryAdapter).getVideoState();
            if (f >= 0.5d && videoState == 1) {
                a.a(this.mBigGalleryAdapter).pauseVideo();
                this.needVideoAutoPlay = true;
            } else if (i2 != 0 || videoState != 2 || !this.needVideoAutoPlay) {
            } else {
                a.a(this.mBigGalleryAdapter).playVideo();
            }
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (!this.fromDetailMain) {
        } else {
            if (i >= this.mBigGallery.getAdapter().getCount() - 1) {
                GalleryViewPager galleryViewPager = this.mBigGallery;
                galleryViewPager.setCurrentItem(galleryViewPager.getAdapter().getCount() - 1);
                changeIndexPos(this.mBigGallery.getAdapter().getCount() - 1);
            } else if (i != 0 || a.a(this.mBigGalleryAdapter) == null) {
            } else {
                if (this.needVideoAutoPlay && (a.a(this.mBigGalleryAdapter).getVideoState() == 0 || a.a(this.mBigGalleryAdapter).getVideoState() == 2)) {
                    a.a(this.mBigGalleryAdapter).playVideo();
                } else if (this.needVideoAutoPlay || a.a(this.mBigGalleryAdapter).getVideoState() != 0 || this.videoCurrentPosition <= 0) {
                } else {
                    a.a(this.mBigGalleryAdapter).playVideo();
                }
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager.a
    public void onPageLastScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8877511", new Object[]{this});
        } else if (!this.fromDetailMain) {
        } else {
            onBack();
        }
    }

    private void dismissPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a167c9", new Object[]{this});
            return;
        }
        Dialog dialog = this.dialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.dialog.dismiss();
        this.dialog = null;
    }

    private void dismissGalleryPopupWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6183bbb", new Object[]{this});
        } else if (this.mContext == null || !isShowing()) {
        } else {
            Dialog dialog = this.dialog;
            if (dialog != null && dialog.isShowing()) {
                return;
            }
            try {
                dismiss();
            } catch (Exception e) {
                com.taobao.android.detail.ttdetail.utils.i.a("GalleryPopupWindow", "dismissGalleryPopupWindow", e);
            }
        }
    }

    private int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue() : SystemBarDecorator.SystemBarConfig.getStatusBarHeight(odg.b().a());
    }

    private String getPicDir(Context context) {
        File externalFilesDir;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("86461378", new Object[]{this, context}) : (context == null || (externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)) == null) ? "" : externalFilesDir.getPath();
    }
}
