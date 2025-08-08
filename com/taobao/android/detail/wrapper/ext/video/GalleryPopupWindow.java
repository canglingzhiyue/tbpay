package com.taobao.android.detail.wrapper.ext.video;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.ext.view.widget.base.CustomViewPager;
import com.taobao.android.detail.core.detail.ext.view.widget.base.GalleryViewPager;
import com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView;
import com.taobao.android.detail.core.detail.kit.utils.g;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndexView;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.utils.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.djt;
import tb.dys;
import tb.dze;
import tb.ecf;
import tb.ecr;
import tb.ecu;
import tb.edp;
import tb.eif;
import tb.emu;
import tb.eoi;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.epp;
import tb.euz;
import tb.eva;
import tb.kge;

/* loaded from: classes5.dex */
public class GalleryPopupWindow extends PopupWindow implements Handler.Callback, ViewPager.OnPageChangeListener, CustomViewPager.a, dys.a, eif {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String DEFAULT_APP_PIC_DIR_PATH = null;
    private static final int MSG_SAVE_ERR_FILE_NOT_FOUND = 302;
    private static final int MSG_SAVE_ERR_INSUFFICIENT_MEMORY = 303;
    private static final int MSG_SAVE_SUCCESS = 301;
    public static final String TAG = "GalleryPopupWindow";
    private Dialog dialog;
    private boolean fromDetailMain;
    private com.taobao.android.detail.core.event.params.c galleryDTO;
    private int imageOffset;
    private Activity mActivity;
    private Application mApp;
    private GalleryViewPager mBigGallery;
    private a mBigGalleryAdapter;
    private View mContainer;
    private Handler mHandler;
    private IndexView mIndexView;
    private int mLastIndex;
    private View mSubDescContainer;
    private TextView mTvDesc;
    private TextView mTvSubDesc;
    private boolean needVideoAutoPlay;
    private boolean supportLongPress;
    private int totalPages;
    private HashMap<String, String> utParams;
    private int videoCurrentPosition;

    static {
        kge.a(-29895245);
        kge.a(-1143650222);
        kge.a(1848919473);
        kge.a(154771754);
        kge.a(-1043440182);
        kge.a(-1514135841);
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

    @Override // com.taobao.android.detail.core.detail.ext.view.widget.base.CustomViewPager.a
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

    public void setSourceBigImgUrls(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd5394", new Object[]{this, strArr});
        }
    }

    public static /* synthetic */ void access$000(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76da6793", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.dismissPopup();
        }
    }

    public static /* synthetic */ a access$100(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("579c8b01", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mBigGalleryAdapter;
    }

    public static /* synthetic */ HashMap access$1000(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("dc88a5a5", new Object[]{galleryPopupWindow}) : galleryPopupWindow.utParams;
    }

    public static /* synthetic */ IndexView access$1100(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndexView) ipChange.ipc$dispatch("49be198e", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mIndexView;
    }

    public static /* synthetic */ boolean access$1200(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae85c348", new Object[]{galleryPopupWindow})).booleanValue() : galleryPopupWindow.needVideoAutoPlay;
    }

    public static /* synthetic */ boolean access$1202(GalleryPopupWindow galleryPopupWindow, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93f41952", new Object[]{galleryPopupWindow, new Boolean(z)})).booleanValue();
        }
        galleryPopupWindow.needVideoAutoPlay = z;
        return z;
    }

    public static /* synthetic */ int access$1500(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5808dcfa", new Object[]{galleryPopupWindow})).intValue() : galleryPopupWindow.imageOffset;
    }

    public static /* synthetic */ void access$1600(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b349048", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.dismissGalleryPopupWindow();
        }
    }

    public static /* synthetic */ boolean access$1700(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1e60438d", new Object[]{galleryPopupWindow})).booleanValue() : galleryPopupWindow.supportLongPress;
    }

    public static /* synthetic */ void access$1800(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18bf6ca", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.showDialogLongForGalleryImage();
        }
    }

    public static /* synthetic */ int access$1900(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4b7a9fe", new Object[]{galleryPopupWindow})).intValue() : galleryPopupWindow.videoCurrentPosition;
    }

    public static /* synthetic */ int access$1902(GalleryPopupWindow galleryPopupWindow, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23fecb89", new Object[]{galleryPopupWindow, new Integer(i)})).intValue();
        }
        galleryPopupWindow.videoCurrentPosition = i;
        return i;
    }

    public static /* synthetic */ boolean access$300(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("205d815a", new Object[]{galleryPopupWindow})).booleanValue() : galleryPopupWindow.fromDetailMain;
    }

    public static /* synthetic */ com.taobao.android.detail.core.event.params.c access$400(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.event.params.c) ipChange.ipc$dispatch("b14bb3d4", new Object[]{galleryPopupWindow}) : galleryPopupWindow.galleryDTO;
    }

    public static /* synthetic */ Activity access$500(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("7846c9d0", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mActivity;
    }

    public static /* synthetic */ void access$600(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e09b19", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.reviewBitImage();
        }
    }

    public static /* synthetic */ Application access$700(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("dd17a429", new Object[]{galleryPopupWindow}) : galleryPopupWindow.mApp;
    }

    public static /* synthetic */ void access$800(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9038019b", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.saveCurrentImage();
        }
    }

    public static /* synthetic */ void access$900(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7363b4dc", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.requestPermission();
        }
    }

    public GalleryPopupWindow(View view, int i, int i2, Activity activity) {
        super(view, i, i2);
        this.mLastIndex = 0;
        this.mActivity = activity;
        emu.a("com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow");
        Activity activity2 = this.mActivity;
        if ((activity2 instanceof DetailCoreActivity) && ((DetailCoreActivity) activity2).y() != null && ((DetailCoreActivity) this.mActivity).y().t != null) {
            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = ((DetailCoreActivity) this.mActivity).y().t;
            HashMap<String, String> hashMap = new HashMap<>(4);
            hashMap.put("item_id", cVar.i());
            hashMap.put("shop_id", cVar.o());
            hashMap.put("seller_id", cVar.h());
            Map<String, String> g = cVar.g();
            if (g != null) {
                hashMap.putAll(g);
            }
            this.utParams = hashMap;
        }
        this.mApp = activity.getApplication();
        DEFAULT_APP_PIC_DIR_PATH = ecr.a(this.mApp);
        this.mHandler = new Handler(this);
        this.mContainer = view;
        this.needVideoAutoPlay = false;
        init();
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.1
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
                dze dzeVar = null;
                if (GalleryPopupWindow.access$300(GalleryPopupWindow.this)) {
                    dzeVar = new dze();
                    dzeVar.f27130a = GalleryPopupWindow.this.getCurrentIndex();
                    if (dzeVar.f27130a < GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.size()) {
                        dzeVar.b = GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.get(dzeVar.f27130a);
                    }
                }
                DetailEvent detailEvent = new DetailEvent(1);
                detailEvent.params = dzeVar;
                com.taobao.android.trade.event.f.a(GalleryPopupWindow.access$500(GalleryPopupWindow.this), detailEvent);
                if (GalleryPopupWindow.access$500(GalleryPopupWindow.this) instanceof DetailCoreActivity) {
                    ((DetailCoreActivity) GalleryPopupWindow.access$500(GalleryPopupWindow.this)).b("#4d000000");
                }
                GalleryPopupWindow.this.stop();
            }
        });
    }

    @Override // android.widget.PopupWindow, tb.eif
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : super.isShowing();
    }

    @Override // android.widget.PopupWindow, tb.eif
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

    public void showGalleryDialog(com.taobao.android.detail.core.event.params.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7130909", new Object[]{this, cVar});
        } else if (cVar == null || cVar.e == null || cVar.e.isEmpty()) {
        } else {
            this.galleryDTO = cVar;
            if (this.galleryDTO.m) {
                this.needVideoAutoPlay = this.galleryDTO.m;
            }
            this.supportLongPress = cVar.f9716a;
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

    public ArrayList<String> processBigImageUrl(com.taobao.android.detail.core.event.params.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("bccc275b", new Object[]{this, cVar});
        }
        if (cVar.d != null) {
            return cVar.d;
        }
        cVar.d = new ArrayList<>();
        Iterator<String> it = cVar.e.iterator();
        while (it.hasNext()) {
            cVar.d.add(g.a(it.next()));
        }
        return cVar.d;
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
            Activity activity = this.mActivity;
            if (activity instanceof DetailCoreActivity) {
                ((DetailCoreActivity) activity).b("#000000");
            }
            try {
                showAtLocation(view, 0, 0, 0);
                update();
                setFocusable(true);
            } catch (Throwable th) {
                epp.a(th);
            }
        }
        this.mBigGalleryAdapter.notifyDataSetChanged();
        resume();
    }

    private void showDialogLongForGalleryImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc7df98", new Object[]{this});
            return;
        }
        this.dialog = new Dialog(this.mActivity, R.style.Theme_TBDialog);
        LinearLayout linearLayout = new LinearLayout(this.mActivity);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackgroundColor(-1);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.mActivity);
        textView.setText("查看原图");
        textView.setTextColor(-16777216);
        textView.setTextSize(1, 22.0f);
        textView.setGravity(19);
        textView.setPadding(epo.h, 0, 0, 0);
        textView.setBackgroundResource(R.drawable.btn_detail_combtn_click);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                GalleryPopupWindow.access$600(GalleryPopupWindow.this);
                GalleryPopupWindow.access$000(GalleryPopupWindow.this);
            }
        });
        linearLayout.addView(textView, layoutParams);
        View view = new View(this.mActivity);
        view.setClickable(false);
        view.setFocusable(false);
        view.setBackgroundColor(com.taobao.android.detail.core.utils.c.a("#dddddd"));
        linearLayout.addView(view, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 1.0f)));
        TextView textView2 = new TextView(this.mApp);
        textView2.setText(com.alibaba.ability.localization.b.a(R.string.x_detail_app_save));
        textView2.setTextSize(1, 22.0f);
        textView2.setTextColor(-16777216);
        textView2.setGravity(19);
        textView2.setPadding(epo.h, 0, 0, 0);
        textView2.setBackgroundResource(R.drawable.btn_detail_combtn_click);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (com.taobao.android.detail.core.utils.f.c(GalleryPopupWindow.access$700(GalleryPopupWindow.this))) {
                    GalleryPopupWindow.access$800(GalleryPopupWindow.this);
                } else {
                    GalleryPopupWindow.access$900(GalleryPopupWindow.this);
                }
                GalleryPopupWindow.access$000(GalleryPopupWindow.this);
            }
        });
        linearLayout.addView(textView2, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f)));
        Activity activity = this.mActivity;
        if (activity != null && (activity instanceof FragmentActivity) && ecu.m && djt.a(this.mActivity)) {
            TextView createOCRTextButton = createOCRTextButton(getCurrentImageIndex(), this.dialog);
            linearLayout.addView(createOCRTextButton, new LinearLayout.LayoutParams((int) (euz.screen_density * 280.0f), (int) (euz.screen_density * 60.0f)));
            if (djt.a(this.mActivity)) {
                textView.setFocusable(true);
                textView2.setFocusable(true);
                createOCRTextButton.setFocusable(true);
            }
        }
        this.dialog.setContentView(linearLayout);
        try {
            this.dialog.show();
        } catch (Throwable unused) {
        }
    }

    private TextView createOCRTextButton(int i, Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2f672c8", new Object[]{this, new Integer(i), dialog});
        }
        try {
            this.galleryDTO.d.get(i);
            TextView textView = new TextView(this.mApp);
            textView.setText("图片文字识别");
            textView.setTextSize(1, 22.0f);
            textView.setTextColor(-16777216);
            textView.setGravity(19);
            textView.setPadding(euz.SIZE_10, 0, 0, 0);
            textView.setBackgroundResource(R.drawable.btn_detail_combtn_click);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        GalleryPopupWindow.access$000(GalleryPopupWindow.this);
                    }
                }
            });
            return textView;
        } catch (Exception e) {
            eva.a(e);
            Handler handler = this.mHandler;
            if (handler == null) {
                return null;
            }
            handler.sendEmptyMessage(302);
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public class a extends dys implements av {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View d;
        private bk e;
        private ImageView f;
        private DetailImageView g;

        static {
            kge.a(1393269495);
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
            return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("d648dc4f", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ bk a(a aVar, bk bkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bk) ipChange.ipc$dispatch("79d46f8f", new Object[]{aVar, bkVar});
            }
            aVar.e = bkVar;
            return bkVar;
        }

        public static /* synthetic */ ImageView b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("cff135a8", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ DetailImageView c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("3a2a7e4e", new Object[]{aVar}) : aVar.g;
        }

        @Override // tb.dys, android.support.v4.view.PagerAdapter
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
                if (this.e == null) {
                    bk.a aVar = new bk.a(GalleryPopupWindow.access$500(GalleryPopupWindow.this));
                    aVar.e("DETAILMAIN");
                    aVar.c("TBVideo");
                    aVar.f(false);
                    aVar.q(true);
                    aVar.g(false);
                    aVar.a(GalleryPopupWindow.access$400(GalleryPopupWindow.this).k);
                    aVar.n(false);
                    aVar.c(epo.b);
                    aVar.d(epo.c - ecr.b(GalleryPopupWindow.access$500(GalleryPopupWindow.this)));
                    aVar.a(GalleryPopupWindow.access$1000(GalleryPopupWindow.this));
                    this.e = aVar.c();
                    this.e.setVideoLifecycleListener(this);
                    this.e.hideCloseView();
                    GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
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
                layoutParams.width = (int) GalleryPopupWindow.access$500(GalleryPopupWindow.this).getResources().getDimension(R.dimen.detail_video_play_btn_width);
                layoutParams.height = (int) GalleryPopupWindow.access$500(GalleryPopupWindow.this).getResources().getDimension(R.dimen.detail_video_play_btn_height);
                if (this.f == null) {
                    this.f = new ImageView(GalleryPopupWindow.access$500(GalleryPopupWindow.this));
                    this.f.setLayoutParams(layoutParams);
                    this.f.setImageResource(R.drawable.detail_video_play);
                    this.f.setVisibility(0);
                    this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            GalleryPopupWindow.access$1202(GalleryPopupWindow.this, true);
                            a.b(a.this).setVisibility(4);
                            a.c(a.this).setVisibility(4);
                            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
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
                if (GalleryPopupWindow.access$1200(GalleryPopupWindow.this)) {
                    GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
                    this.f.setVisibility(4);
                    this.g.setVisibility(4);
                    this.e.start();
                } else {
                    GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(0);
                    this.f.setVisibility(0);
                    this.g.setVisibility(0);
                }
                return this.e.getView();
            }
            int access$1500 = i - GalleryPopupWindow.access$1500(GalleryPopupWindow.this);
            if (GalleryPopupWindow.access$300(GalleryPopupWindow.this) && access$1500 >= GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.size()) {
                if (this.d == null) {
                    this.d = View.inflate(GalleryPopupWindow.access$500(GalleryPopupWindow.this), R.layout.x_detail_main_gallery_scroll_limit_tip_blackbg, null);
                    this.d.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                }
                viewGroup.addView(this.d, 0);
                return this.d;
            }
            String str = GalleryPopupWindow.access$400(GalleryPopupWindow.this).d.get(access$1500);
            TouchImageView touchImageView = new TouchImageView(GalleryPopupWindow.access$500(GalleryPopupWindow.this));
            touchImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            touchImageView.setContentDescription(GalleryPopupWindow.access$500(GalleryPopupWindow.this).getString(R.string.detail_content_description_pic));
            touchImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        GalleryPopupWindow.access$1600(GalleryPopupWindow.this);
                    }
                }
            });
            touchImageView.setOnLongClickListener(new View$OnLongClickListenerC0448a(touchImageView, str));
            epl a2 = new epl.a().b(R.drawable.detail_img_load_fail).b(ImageView.ScaleType.CENTER_INSIDE).c(touchImageView.getScaleType()).c(epo.b).d(epo.c).a();
            com.taobao.android.detail.datasdk.protocol.adapter.core.c b = epj.b();
            if (b != null) {
                try {
                    b.a(str, touchImageView, a2);
                } catch (Throwable unused) {
                }
            }
            viewGroup.addView(touchImageView, 0);
            return touchImageView;
        }

        /* renamed from: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class View$OnLongClickListenerC0448a implements View.OnLongClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private TouchImageView b;
            private String c;

            static {
                kge.a(2131036562);
                kge.a(1426707756);
            }

            public View$OnLongClickListenerC0448a(TouchImageView touchImageView, String str) {
                this.b = touchImageView;
                this.c = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (this.b != null && !com.alibaba.ability.localization.b.c() && GalleryPopupWindow.access$1700(GalleryPopupWindow.this) && !this.b.isZoomState() && !this.b.isActionMoving()) {
                    if (StringUtils.equals("true", OrangeConfig.getInstance().getConfig("android_share_bizconfig", "DetailImagePopupLongPressShare", "false"))) {
                        eoi eoiVar = new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT);
                        eoiVar.b = new HashMap();
                        eoiVar.b.put("share_businessId", "picture-desc");
                        eoiVar.b.put("share_imageUrl", this.c);
                        com.taobao.android.trade.event.f.a(GalleryPopupWindow.access$500(GalleryPopupWindow.this), eoiVar);
                    } else {
                        GalleryPopupWindow.access$1800(GalleryPopupWindow.this);
                    }
                }
                return false;
            }
        }

        @Override // tb.dys, android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (obj == null) {
            } else {
                com.taobao.android.detail.datasdk.protocol.adapter.core.c b = epj.b();
                if (b != null && (obj instanceof ImageView)) {
                    b.a((String) null, (DetailImageView) obj);
                }
                if (i == 0 && !StringUtils.isEmpty(GalleryPopupWindow.access$400(GalleryPopupWindow.this).k) && !StringUtils.isEmpty(GalleryPopupWindow.access$400(GalleryPopupWindow.this).l)) {
                    bk bkVar = this.e;
                    if (bkVar != null) {
                        bkVar.removeCoverView(this.g);
                        this.e.removeCoverView(this.f);
                        if (this.e.getVideoState() == 1) {
                            GalleryPopupWindow.access$1202(GalleryPopupWindow.this, true);
                        }
                        GalleryPopupWindow.access$1902(GalleryPopupWindow.this, this.e.getCurrentPosition());
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
            i.d("GalleryPopupWindow", "onVideoStart");
            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
            this.g.setVisibility(4);
            this.f.setVisibility(4);
            if (GalleryPopupWindow.access$1900(GalleryPopupWindow.this) <= 0) {
                return;
            }
            this.e.seekTo(GalleryPopupWindow.access$1900(GalleryPopupWindow.this));
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                return;
            }
            i.d("GalleryPopupWindow", "onVideoPause");
            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
            this.g.setVisibility(4);
            this.f.setVisibility(4);
            if (z) {
                GalleryPopupWindow.access$1202(GalleryPopupWindow.this, true);
            }
            GalleryPopupWindow.access$1902(GalleryPopupWindow.this, this.e.getCurrentPosition());
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            i.d("GalleryPopupWindow", "onVideoPlay");
            GalleryPopupWindow.access$1202(GalleryPopupWindow.this, false);
            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
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
            i.d("GalleryPopupWindow", "onVideoPrepared");
            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
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
            i.d("GalleryPopupWindow", "onVideoComplete");
            if (!this.e.isFullScreen()) {
                GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(0);
            }
            this.g.setVisibility(0);
            this.f.setVisibility(0);
            GalleryPopupWindow.access$1902(GalleryPopupWindow.this, 0);
            GalleryPopupWindow.access$1202(GalleryPopupWindow.this, false);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
                return;
            }
            i.d("GalleryPopupWindow", "onVideoClose");
            this.g.setVisibility(0);
            this.f.setVisibility(0);
            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(0);
            GalleryPopupWindow.access$1902(GalleryPopupWindow.this, this.e.getCurrentPosition());
        }

        @Override // com.taobao.avplayer.av
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                return;
            }
            i.d("GalleryPopupWindow", "onVideoFullScreen");
            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
            this.g.getLayoutParams().width = epo.c;
            this.g.getLayoutParams().height = epo.c;
        }

        @Override // com.taobao.avplayer.av
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                return;
            }
            i.d("GalleryPopupWindow", "onVideoNormalScreen");
            GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(0);
            this.g.getLayoutParams().width = epo.b;
        }

        private DetailImageView a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailImageView) ipChange.ipc$dispatch("b7a54d65", new Object[]{this, str});
            }
            DetailImageView detailImageView = new DetailImageView(GalleryPopupWindow.access$500(GalleryPopupWindow.this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.height = this.e.getView().getLayoutParams().height;
            layoutParams.width = this.e.getView().getLayoutParams().width;
            detailImageView.setLayoutParams(layoutParams);
            detailImageView.setContentDescription(GalleryPopupWindow.access$500(GalleryPopupWindow.this).getString(R.string.detail_content_description_pic));
            detailImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    GalleryPopupWindow.access$1202(GalleryPopupWindow.this, true);
                    a.b(a.this).setVisibility(4);
                    a.c(a.this).setVisibility(4);
                    GalleryPopupWindow.access$1100(GalleryPopupWindow.this).setVisibility(8);
                    int videoState = a.a(a.this).getVideoState();
                    if (videoState == 2 || videoState == 4 || videoState == 6) {
                        a.a(a.this).playVideo();
                    } else {
                        a.a(a.this).start();
                    }
                }
            });
            detailImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.a.4
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
            epl a2 = new epl.a().b(R.drawable.detail_img_load_fail).b(ImageView.ScaleType.CENTER_INSIDE).c(detailImageView.getScaleType()).a();
            com.taobao.android.detail.datasdk.protocol.adapter.core.c b = epj.b();
            if (b != null) {
                try {
                    b.a(str, detailImageView, a2);
                } catch (Throwable unused) {
                }
            }
            return detailImageView;
        }
    }

    @Override // tb.dys.a
    public void onItemChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb11cba", new Object[]{this, new Integer(i)});
            return;
        }
        ecf.a(this.mActivity, i);
        changeIndexPos(i);
        if (i != 0 || a.a(this.mBigGalleryAdapter) == null || StringUtils.isEmpty(this.galleryDTO.k) || StringUtils.isEmpty(this.galleryDTO.l)) {
            return;
        }
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c.a(this.mActivity, this.galleryDTO.n, this.galleryDTO.o, null);
    }

    private void changeIndexPos(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1a56aa", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.detail.core.event.params.c cVar = this.galleryDTO;
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

    private void requestPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb4c6345", new Object[]{this});
        } else {
            com.taobao.android.detail.core.utils.f.a(this.mActivity, this.mApp, new f.a() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.utils.f.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        AsyncTask.execute(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.video.GalleryPopupWindow.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    GalleryPopupWindow.access$800(GalleryPopupWindow.this);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    private void saveCurrentImage() {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c0ee86", new Object[]{this});
            return;
        }
        try {
            String str = this.galleryDTO.d.get(getCurrentImageIndex());
            GalleryViewPager galleryViewPager = this.mBigGallery;
            if (galleryViewPager == null) {
                return;
            }
            TouchImageView touchImageView = galleryViewPager.mCurrentView;
            if (touchImageView == null || touchImageView.getDrawable() == null || !(touchImageView.getDrawable() instanceof BitmapDrawable)) {
                Handler handler = this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.sendEmptyMessage(302);
                return;
            }
            Bitmap bitmap = ((BitmapDrawable) touchImageView.getDrawable()).getBitmap();
            if (bitmap == null) {
                Handler handler2 = this.mHandler;
                if (handler2 == null) {
                    return;
                }
                handler2.sendEmptyMessage(302);
                return;
            }
            String str2 = str.hashCode() + ".jpg";
            if (com.taobao.android.detail.core.utils.f.c(this.mApp)) {
                a2 = com.taobao.android.detail.core.utils.f.a(this.mApp, bitmap, str2);
            } else {
                a2 = com.taobao.android.detail.core.utils.f.a(this.mApp, str2, bitmap, DEFAULT_APP_PIC_DIR_PATH);
            }
            Handler handler3 = this.mHandler;
            if (handler3 == null) {
                return;
            }
            if (a2) {
                handler3.sendEmptyMessage(301);
            } else {
                handler3.sendEmptyMessage(303);
            }
        } catch (Exception e) {
            i.a("GalleryPopupWindow", "saveCurrentImage", e);
            Handler handler4 = this.mHandler;
            if (handler4 == null) {
                return;
            }
            handler4.sendEmptyMessage(302);
        }
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

    @Override // com.taobao.android.detail.core.detail.ext.view.widget.base.CustomViewPager.a
    public void onPageLastScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8877511", new Object[]{this});
        } else if (!this.fromDetailMain) {
        } else {
            ecf.f(this.mActivity);
            onBack();
            com.taobao.android.trade.event.f.a(this.mActivity, new edp());
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 301:
                epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_image_saved_success));
                break;
            case 302:
                epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_save_img_error));
                break;
            case 303:
                epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_storage_failure));
                break;
        }
        return true;
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
        } else if (this.mActivity == null || !isShowing()) {
        } else {
            Dialog dialog = this.dialog;
            if (dialog != null && dialog.isShowing()) {
                return;
            }
            try {
                dismiss();
            } catch (Exception e) {
                i.a("GalleryPopupWindow", "dismissGalleryPopupWindow", e);
            }
        }
    }
}
