package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.g;
import com.taobao.android.detail.core.detail.kit.utils.o;
import com.taobao.android.detail.core.utils.f;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaRelativeLayout;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.view.TouchImageView;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.io.File;
import java.util.HashMap;
import tb.dzb;
import tb.ecu;
import tb.emu;
import tb.eoi;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.eps;
import tb.kge;
import tb.rmn;

/* loaded from: classes5.dex */
public class c implements Handler.Callback, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Detail_Gallery_Normal_Photo";
    public static int d;
    private static String e;
    private NormalImageModel f;
    private Context h;
    private MultiMediaRelativeLayout i;
    private DetailImageView j;
    private com.taobao.android.detail.datasdk.protocol.image.b k;
    private Dialog l;
    private Handler m;
    private MultiMediaViewModel.a n;
    private dzb g = new dzb();

    /* renamed from: a  reason: collision with root package name */
    public boolean f11235a = false;
    public boolean b = true;
    public boolean c = false;

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b006b1", new Object[]{cVar});
        } else {
            cVar.f();
        }
    }

    public static /* synthetic */ NormalImageModel b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NormalImageModel) ipChange.ipc$dispatch("c93b6625", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86306def", new Object[]{cVar});
        } else {
            cVar.e();
        }
    }

    public static /* synthetic */ void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f0a18e", new Object[]{cVar});
        } else {
            cVar.i();
        }
    }

    public static /* synthetic */ Context e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("624bbd25", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ MultiMediaViewModel.a f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiMediaViewModel.a) ipChange.ipc$dispatch("683cd966", new Object[]{cVar}) : cVar.n;
    }

    public static /* synthetic */ DetailImageView g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("9b8dac4c", new Object[]{cVar}) : cVar.j;
    }

    public static /* synthetic */ void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f1700a", new Object[]{cVar});
        } else {
            cVar.d();
        }
    }

    static {
        kge.a(1107523563);
        kge.a(-1917972144);
        kge.a(-1043440182);
        d = epo.b(55);
    }

    public c(Context context) {
        this.h = context;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.NormalImageViewModel");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) ipChange.ipc$dispatch("852695bd", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new MultiMediaRelativeLayout(this.h);
        }
        this.i.setSupposedWidth(this.n.c());
        this.i.setLayoutParams(new RecyclerView.LayoutParams(this.n.c(), -1));
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar = new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a(this.i) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.1
        };
        aVar.a(this);
        return aVar;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void reRenderViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48afe97e", new Object[]{this, aVar});
            return;
        }
        this.i = (MultiMediaRelativeLayout) aVar.a();
        if (this.i.getChildCount() > 0) {
            this.i.removeAllViews();
        }
        a();
        int c = this.n.c();
        if (this.f.skuFirstPhotoFlag) {
            c += d;
        }
        if (this.f.parentModel.isPopupMode) {
            this.i.setLayoutParams(new RecyclerView.LayoutParams(c, -1));
        } else {
            this.i.setLayoutParams(new RecyclerView.LayoutParams(c, this.n.b()));
        }
        this.i.setSupposedWidth(c);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.l = new Dialog(this.h, R.style.Theme_TBDialog);
        LinearLayout linearLayout = new LinearLayout(this.h);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackgroundColor(-1);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.h);
        textView.setText("查看原图");
        textView.setTextColor(-16777216);
        textView.setTextSize(1, 22.0f);
        textView.setGravity(19);
        textView.setPadding(epo.h, 0, 0, 0);
        textView.setBackgroundResource(R.drawable.btn_detail_combtn_click);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    c.a(c.this);
                }
            }
        });
        linearLayout.addView(textView, layoutParams);
        View view = new View(this.h);
        view.setClickable(false);
        view.setFocusable(false);
        view.setBackgroundColor(com.taobao.android.detail.core.utils.c.a("#dddddd"));
        linearLayout.addView(view, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 1.0f)));
        TextView textView2 = new TextView(this.f.parentModel.mApp);
        textView2.setText(com.alibaba.ability.localization.b.a(R.string.x_detail_app_save));
        textView2.setTextSize(1, 22.0f);
        textView2.setTextColor(-16777216);
        textView2.setGravity(19);
        textView2.setPadding(epo.h, 0, 0, 0);
        textView2.setBackgroundResource(R.drawable.btn_detail_combtn_click);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (f.c(c.b(c.this).parentModel.mApp)) {
                    c.c(c.this);
                } else {
                    c.d(c.this);
                }
                c.a(c.this);
            }
        });
        linearLayout.addView(textView2, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f)));
        this.l.setContentView(linearLayout);
        try {
            this.l.show();
        } catch (Throwable unused) {
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            f.a(this.h, this.f.parentModel.mApp, new f.a() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.utils.f.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        AsyncTask.execute(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    c.c(c.this);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    private void e() {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String str = this.f.imageUrl;
        if (StringUtils.isEmpty(this.f.imageUrl)) {
            Handler handler = this.m;
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessage(302);
            return;
        }
        DetailImageView detailImageView = this.j;
        if (detailImageView == null || detailImageView.getDrawable() == null || !(this.j.getDrawable() instanceof BitmapDrawable)) {
            Handler handler2 = this.m;
            if (handler2 == null) {
                return;
            }
            handler2.sendEmptyMessage(302);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) this.j.getDrawable()).getBitmap();
        if (bitmap == null) {
            Handler handler3 = this.m;
            if (handler3 == null) {
                return;
            }
            handler3.sendEmptyMessage(302);
            return;
        }
        String str2 = str.hashCode() + ".jpg";
        if (f.c(this.f.parentModel.mApp)) {
            a2 = f.a(this.f.parentModel.mApp, bitmap, str2);
        } else {
            a2 = f.a(this.f.parentModel.mApp, str2, bitmap, e);
        }
        Handler handler4 = this.m;
        if (handler4 == null) {
            return;
        }
        if (a2) {
            handler4.sendEmptyMessage(301);
        } else {
            handler4.sendEmptyMessage(303);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Dialog dialog = this.l;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.l.dismiss();
        this.l = null;
    }

    public static String a(Context context) {
        File externalFilesDir;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : (context == null || (externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)) == null) ? "" : externalFilesDir.getPath();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        NormalImageModel normalImageModel = this.f;
        if (normalImageModel == null) {
            return;
        }
        e = a(normalImageModel.parentModel.mApp);
        if (!this.f.parentModel.isPopupMode) {
            this.j = new DetailImageView(this.h);
            this.j.setId(R.id.taodetail_gallery_image);
            this.i.setOnClickListener(this.n.a(this.f.getIndex(), null));
            this.i.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    if (c.b(c.this).supportLongPress && StringUtils.equals("true", OrangeConfig.getInstance().getConfig("android_share_bizconfig", "HeaderDetailImageLongPressShare", "false"))) {
                        eoi eoiVar = new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT);
                        eoiVar.b = new HashMap();
                        eoiVar.b.put("share_businessId", "picture");
                        eoiVar.b.put("share_imageUrl", c.b(c.this).imageUrl);
                        com.taobao.android.trade.event.f.a(c.e(c.this), eoiVar);
                    }
                    return false;
                }
            });
        } else {
            this.j = new TouchImageView(this.h);
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.j.setContentDescription(this.h.getString(R.string.detail_content_description_pic));
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        c.f(c.this).a(c.b(c.this).parentModel);
                    }
                }
            });
            this.j.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    if (c.b(c.this).supportLongPress && 2 != ((TouchImageView) c.g(c.this)).getMode()) {
                        if (StringUtils.equals("true", OrangeConfig.getInstance().getConfig("android_share_bizconfig", "HeaderTouchImageLongPressShare", "false"))) {
                            eoi eoiVar = new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT);
                            eoiVar.b = new HashMap();
                            eoiVar.b.put("share_businessId", "picture");
                            eoiVar.b.put("share_imageUrl", c.b(c.this).imageUrl);
                            com.taobao.android.trade.event.f.a(c.e(c.this), eoiVar);
                        } else {
                            c.h(c.this);
                        }
                    }
                    return false;
                }
            });
            this.i.setOnClickListener(null);
            this.i.setOnLongClickListener(null);
        }
        try {
            g();
        } catch (Throwable th) {
            rmn.a(th);
        }
        DetailImageView detailImageView = this.j;
        detailImageView.setContentDescription(this.h.getString(R.string.detail_content_description_pic) + (this.f.getIndex() + 1));
        rmn.b("Detail_Gallery_Normal_Photo", "get position at " + this.f.index + " @ " + System.currentTimeMillis());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(15, -1);
        if (this.f.skuFirstPhotoFlag && !this.f.parentModel.isPopupMode) {
            layoutParams.setMargins(d, 0, 0, 0);
        }
        this.i.addView(this.j, layoutParams);
        if (StringUtils.isEmpty(this.f.skuBottomText)) {
            return;
        }
        TextView textView = new TextView(this.h);
        textView.setTextColor(-1);
        textView.setTextSize(10.0f);
        textView.setText(this.f.skuBottomText);
        textView.setGravity(17);
        textView.setBackgroundResource(R.drawable.detail_sku_gallery_bottom_text_bg);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, epo.b(20));
        layoutParams2.setMargins(this.f.skuFirstPhotoFlag ? d + 0 : 0, 0, 0, epo.b(10));
        layoutParams2.addRule(12, -1);
        layoutParams2.addRule(14, -1);
        this.i.addView(textView, layoutParams2);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a3efa", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f.parentModel.itemId)) {
        } else {
            Context context = this.h;
            eps.a(context, "MovePic", new Pair("spm", "a2141.7631564.1999020712." + this.f.getIndex()), new Pair("imageUrl", this.f.imageUrl));
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.m = new Handler(this);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            if (this.j == null) {
                return;
            }
            epj.b().a((String) null, this.j);
            rmn.b("MainGalleryView", "onDestroy image url: " + this.f.imageUrl);
        } catch (Exception e2) {
            rmn.a("MainGalleryView", "onPause() image recycle onFailure caused by " + e2.toString());
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
            return;
        }
        this.f = (NormalImageModel) subItemModel;
        b();
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void setParentModelUtils(MultiMediaViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8356acef", new Object[]{this, aVar});
        } else {
            this.n = aVar;
        }
    }

    private boolean g() {
        String str;
        String a2;
        View a3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        final DetailImageView detailImageView = null;
        DetailImageView detailImageView2 = this.j;
        if (detailImageView2 != null) {
            if (detailImageView2 instanceof DetailImageView) {
                detailImageView = detailImageView2;
            } else if ((detailImageView2 instanceof ViewGroup) && (a3 = o.a((ViewGroup) detailImageView2, DetailImageView.class)) != null) {
                detailImageView = (DetailImageView) a3;
            }
        }
        if (detailImageView == null) {
            return false;
        }
        if (this.c) {
            if (this.f.parentModel.isPopupMode) {
                detailImageView.setScaleType(ImageView.ScaleType.MATRIX);
            } else if (ecu.F) {
                detailImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            MultiMediaViewModel.a aVar = this.n;
            if (aVar != null && aVar.a()) {
                z = true;
            }
        } else {
            MultiMediaViewModel.a aVar2 = this.n;
            if (aVar2 != null && aVar2.a()) {
                detailImageView.setPadding(0, (int) (epo.f27511a * 50.0f), 0, (int) (epo.f27511a * 50.0f));
                detailImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                if (this.f.parentModel.isPopupMode) {
                    detailImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (ecu.F) {
                    detailImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else {
                    detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                this.c = true;
            }
        }
        rmn.b("Detail_Gallery_Normal_Photo", "[profile] setImageUrl >>" + this.g.f27129a + " @" + System.currentTimeMillis() + "");
        this.k = new com.taobao.android.detail.datasdk.protocol.image.b() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onSuccess(com.taobao.android.detail.datasdk.protocol.image.a aVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a8e27a", new Object[]{this, aVar3});
                } else {
                    c.this.f11235a = false;
                }
            }

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onFailure(com.taobao.android.detail.datasdk.protocol.image.a aVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("15b99301", new Object[]{this, aVar3});
                    return;
                }
                c.this.f11235a = true;
                try {
                    detailImageView.setImageResource(R.drawable.detail_img_load_fail);
                } catch (Throwable unused) {
                }
                detailImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
        };
        if (z && !StringUtils.isEmpty(this.g.b)) {
            str = this.g.b;
        } else if (this.b) {
            MultiMediaViewModel.a aVar3 = this.n;
            if (aVar3 != null && aVar3.a()) {
                a2 = g.b(this.h, this.g.f27129a, h());
            } else {
                a2 = g.a(this.h, this.g.f27129a, h());
            }
            if (!StringUtils.isEmpty(a2)) {
                str = a2.replace("END_IMAGE_URL", "");
            } else {
                str = this.g.f27129a;
            }
        } else {
            str = this.g.f27129a;
        }
        if (!StringUtils.isEmpty(str)) {
            epj.b().a(str.replaceAll("END_IMAGE_URL", ""), detailImageView, new epl.a().a(R.drawable.detail_img_load_fail).a(), this.k);
        }
        return true;
    }

    private int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        MultiMediaViewModel.a aVar = this.n;
        if (aVar != null && aVar.a()) {
            return (int) (epo.f27511a * 100.0f);
        }
        return (int) (epo.f27511a * 310.0f);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        NormalImageModel normalImageModel = this.f;
        if (normalImageModel == null) {
            return;
        }
        this.g.f27129a = normalImageModel.imageUrl;
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

    public TouchImageView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TouchImageView) ipChange.ipc$dispatch("7c16b46f", new Object[]{this});
        }
        DetailImageView detailImageView = this.j;
        if (!(detailImageView instanceof TouchImageView)) {
            return null;
        }
        return (TouchImageView) detailImageView;
    }
}
