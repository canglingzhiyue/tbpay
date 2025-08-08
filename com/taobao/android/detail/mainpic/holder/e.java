package com.taobao.android.detail.mainpic.holder;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.provider.MediaStore;
import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.widget.TouchImageView;
import com.taobao.android.litecreator.util.al;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.bny;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.epp;
import tb.etx;
import tb.ety;
import tb.euo;
import tb.euq;
import tb.eus;
import tb.euu;
import tb.euw;
import tb.eux;
import tb.jpx;

/* loaded from: classes4.dex */
public class e extends com.alibaba.android.ultron.vfw.viewholder.b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String e = "lightoffMainpicImg";
    public TouchImageView f;
    public etx g;
    public com.taobao.android.detail.mainpic.g h;
    private Dialog i;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ IDMComponent a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("ba6e5510", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ boolean a(e eVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b702a40", new Object[]{eVar, context})).booleanValue() : eVar.a(context);
    }

    public static /* synthetic */ IDMComponent b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("1379a091", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632b5b0e", new Object[]{eVar});
        } else {
            eVar.e();
        }
    }

    public static /* synthetic */ IDMComponent d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("c5903793", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623e8f10", new Object[]{eVar});
        } else {
            eVar.g();
        }
    }

    public static /* synthetic */ IDMComponent f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("77a6ce95", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ bny g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("18189327", new Object[]{eVar}) : eVar.f2738a;
    }

    public static /* synthetic */ void h(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60db5d13", new Object[]{eVar});
        } else {
            eVar.i();
        }
    }

    public static /* synthetic */ void i(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6064f714", new Object[]{eVar});
        } else {
            eVar.h();
        }
    }

    public static /* synthetic */ IDMComponent k(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("34df481a", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ IDMComponent l(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("8dea939b", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ IDMComponent m(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("e6f5df1c", new Object[]{eVar}) : eVar.c;
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e a(final etx etxVar, final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("594ec67c", new Object[]{etxVar, gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new e(bnyVar, etx.this, gVar);
            }
        };
    }

    public e(bny bnyVar, etx etxVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.g = etxVar;
        this.h = gVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.f = new TouchImageView(viewGroup.getContext());
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.holder.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    e.this.g.a(e.a(e.this), e.this.f);
                }
            }
        });
        this.f.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.mainpic.holder.e.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (e.this.f.getMode() != 2 && e.this.f.enableLongClick()) {
                    if (euo.a()) {
                        e.this.g.b(e.b(e.this), e.this.f);
                    } else {
                        e.c(e.this);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("item_id", e.this.h.o().d());
                    hashMap.put("seller_id", e.this.h.o().h());
                    hashMap.put("user_id", e.this.h.o().k());
                    hashMap.put("image_id", e.d(e.this).getFields().getString("url"));
                    eux.c(hashMap);
                }
                return false;
            }
        });
        return this.f;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        this.c = iDMComponent;
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-1, euu.a(euq.a(iDMComponent), this.h)));
        epj.b().a(iDMComponent.getFields().getString("url"), this.f, new epl.a().a(R.drawable.detail_img_load_fail).a(), (com.taobao.android.detail.datasdk.protocol.image.b) null);
    }

    @Override // com.taobao.android.detail.mainpic.holder.c
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : !this.f.canScrollHorizontally(i);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Context k = this.f2738a.k();
        this.i = new Dialog(k, R.style.Theme_TBDialog);
        LinearLayout linearLayout = new LinearLayout(k);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackgroundColor(-1);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(k);
        textView.setText("查看原图");
        textView.setTextColor(-16777216);
        textView.setTextSize(1, 22.0f);
        textView.setGravity(19);
        textView.setPadding(epo.h, 0, 0, 0);
        textView.setBackgroundResource(R.drawable.main_pic_combtn_click);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.holder.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                e.e(e.this);
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", e.this.h.o().d());
                hashMap.put("seller_id", e.this.h.o().h());
                hashMap.put("user_id", e.this.h.o().k());
                hashMap.put("image_id", e.f(e.this).getFields().getString("url"));
                eux.d(hashMap);
            }
        });
        linearLayout.addView(textView, layoutParams);
        View view = new View(k);
        view.setClickable(false);
        view.setFocusable(false);
        view.setBackgroundColor(Color.parseColor("#dddddd"));
        linearLayout.addView(view, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 1.0f)));
        TextView textView2 = new TextView(k);
        textView2.setText("保存");
        textView2.setTextSize(1, 22.0f);
        textView2.setTextColor(-16777216);
        textView2.setGravity(19);
        textView2.setPadding(epo.h, 0, 0, 0);
        textView2.setBackgroundResource(R.drawable.main_pic_combtn_click);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.holder.e.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                e eVar = e.this;
                if (!e.a(eVar, e.g(eVar).k()) || Build.VERSION.SDK_INT < 29) {
                    e.h(e.this);
                } else {
                    e.i(e.this);
                }
                e.e(e.this);
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", e.this.h.o().d());
                hashMap.put("seller_id", e.this.h.o().h());
                hashMap.put("user_id", e.this.h.o().k());
                hashMap.put("image_id", e.k(e.this).getFields().getString("url"));
                eux.e(hashMap);
            }
        });
        linearLayout.addView(textView2, new LinearLayout.LayoutParams((int) (epo.f27511a * 280.0f), (int) (epo.f27511a * 60.0f)));
        a(k, linearLayout);
        this.i.setContentView(linearLayout);
        try {
            this.i.show();
        } catch (Throwable unused) {
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ety i = this.h.i();
        if (i == null) {
            UnifyLog.d("LightOffImageViewHolder", "GrantPermissionListener 没有设置");
            if (!jpx.a(this.f2738a.k())) {
                return;
            }
            Toast.makeText(this.f2738a.k(), "GrantPermissionListener 没有设置", 0).show();
            return;
        }
        ety.a aVar = new ety.a();
        aVar.b = new Runnable() { // from class: com.taobao.android.detail.mainpic.holder.e.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                }
            }
        };
        aVar.f27574a = new Runnable() { // from class: com.taobao.android.detail.mainpic.holder.e.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AsyncTask.execute(new Runnable() { // from class: com.taobao.android.detail.mainpic.holder.e.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                e.i(e.this);
                            }
                        }
                    });
                }
            }
        };
        aVar.c = f();
        aVar.d = "当您使用相册时需要用到读取权限";
        aVar.e = "GrantPermissionEvent";
        i.a(aVar);
    }

    private String[] f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3a68f47c", new Object[]{this});
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (!a(this.f2738a.k())) {
            return strArr;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return new String[]{al.READ_MEDIA_IMAGES, al.READ_MEDIA_VISUAL_USER_SELECTED};
        }
        return Build.VERSION.SDK_INT == 33 ? new String[]{al.READ_MEDIA_IMAGES} : strArr;
    }

    private void a(final Context context, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383c0087", new Object[]{this, context, linearLayout});
            return;
        }
        try {
            if (!ImageSearchView.isEnable(context, this.h.o().d(), this.h.o().h())) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", this.h.o().d());
            hashMap.put("seller_id", this.h.o().h());
            hashMap.put("user_id", this.h.o().k());
            hashMap.put("image_id", this.c.getFields().getString("url"));
            hashMap.put("rainbow", URLEncoder.encode(com.taobao.search.rainbow.a.c()));
            eux.g(hashMap);
            new ImageSearchView(context).addToParent(linearLayout, new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.holder.e.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    try {
                        String string = e.l(e.this).getFields().getString("url");
                        if (string != null) {
                            if (!string.startsWith("http")) {
                                string = com.taobao.vessel.utils.b.HTTPS_SCHEMA + string;
                            }
                            Nav.from(context).toUri(Uri.parse("http://h5.m.taobao.com/tusou/image_editor/index.html").buildUpon().appendQueryParameter("pssource", "detailtouch").appendQueryParameter("item_id", e.this.h.o().d()).appendQueryParameter("seller_id", e.this.h.o().h()).appendQueryParameter("user_id", e.this.h.o().k()).appendQueryParameter(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, "detailtouch").appendQueryParameter(com.etao.feimagesearch.model.d.KEY_PIC_URL, string).build());
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("item_id", e.this.h.o().d());
                            hashMap2.put("seller_id", e.this.h.o().h());
                            hashMap2.put("user_id", e.this.h.o().k());
                            hashMap2.put("image_id", e.m(e.this).getFields().getString("url"));
                            hashMap2.put("rainbow", URLEncoder.encode(com.taobao.search.rainbow.a.c()));
                            eux.f(hashMap2);
                        }
                    } catch (Exception unused) {
                    }
                    e.e(e.this);
                }
            });
        } catch (Exception unused) {
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Dialog dialog = this.i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.i.dismiss();
        this.i = null;
    }

    private void h() {
        String string;
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Context k = this.f2738a.k();
        if (StringUtils.isEmpty(this.c.getFields().getString("url"))) {
            a("存储失败，无法获取图片");
            return;
        }
        TouchImageView touchImageView = this.f;
        if (touchImageView == null || touchImageView.getDrawable() == null || !(this.f.getDrawable() instanceof BitmapDrawable)) {
            a("存储失败，无法获取图片");
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) this.f.getDrawable()).getBitmap();
        if (bitmap == null) {
            a("存储失败，无法获取图片");
            return;
        }
        String str = string.hashCode() + ".jpg";
        if (a(k) && Build.VERSION.SDK_INT >= 29) {
            a2 = a(k, bitmap, str);
        } else {
            a2 = a(k, str, bitmap);
        }
        if (a2) {
            return;
        }
        a("存储失败，可能存储空间不足");
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : (context == null || context.getApplicationInfo() == null || context.getApplicationInfo().targetSdkVersion < 33) ? false : true;
    }

    private boolean a(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69b5f41c", new Object[]{this, context, bitmap, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("datetaken", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        contentValues.put("width", Integer.valueOf(bitmap.getWidth()));
        contentValues.put("height", Integer.valueOf(bitmap.getHeight()));
        contentValues.put("is_pending", (Integer) 1);
        OutputStream outputStream = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (insert == null) {
                    epp.a("LightOffImageViewHolder", "saveToMediaStoreForQ insert failed: uri = null");
                    euw.a("uri is null");
                    return false;
                }
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(insert, contentValues, null, null);
                    a(ILocalizationService.IMAGE_SAVED_SUCCESS);
                    if (openOutputStream != null) {
                        try {
                            openOutputStream.close();
                        } catch (IOException e2) {
                            epp.a(e2);
                        }
                    }
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    outputStream = openOutputStream;
                    epp.a("LightOffImageViewHolder", "saveToMediaStoreForQ to Mediastore failed: " + e.toString());
                    euw.a(e.getMessage());
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            epp.a(e4);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    outputStream = openOutputStream;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e5) {
                            epp.a(e5);
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean a(Context context, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c4748", new Object[]{this, context, str, bitmap})).booleanValue();
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (externalStoragePublicDirectory != null) {
            if (a(externalStoragePublicDirectory.getPath() + File.separator + "taobao" + File.separator, str, bitmap)) {
                return true;
            }
        }
        if (context != null) {
            externalStoragePublicDirectory = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        }
        if (externalStoragePublicDirectory == null) {
            return false;
        }
        return a(externalStoragePublicDirectory.getPath() + File.separator, str, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r7, java.lang.String r8, android.graphics.Bitmap r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.mainpic.holder.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r7 = 2
            r1[r7] = r8
            r7 = 3
            r1[r7] = r9
            java.lang.String r7 = "4c077036"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L22:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            java.io.File r7 = r0.getParentFile()
            r8 = 0
            boolean r1 = r7.exists()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            if (r1 != 0) goto L44
            r7.mkdirs()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
        L44:
            java.lang.String r7 = "LightOffImageViewHolder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            r1.<init>()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            java.lang.String r4 = "save bitmap to "
            r1.append(r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            java.lang.String r4 = r0.getPath()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            r1.append(r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            tb.epp.b(r7, r1)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            r1 = 100
            r9.compress(r8, r1, r7)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            java.lang.String r9 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r8.<init>(r9)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            r9.<init>(r0)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            android.net.Uri r9 = android.net.Uri.fromFile(r9)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            r8.setData(r9)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            tb.bny r9 = r6.f2738a     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            android.content.Context r9 = r9.k()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            r9.sendBroadcast(r8)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            java.lang.String r8 = "图片保存到相册成功"
            r6.a(r8)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lb2
            r7.close()     // Catch: java.io.IOException -> L94
            goto L98
        L94:
            r7 = move-exception
            tb.epp.a(r7)
        L98:
            return r2
        L99:
            r8 = move-exception
            goto La4
        L9b:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto Lb3
        La0:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        La4:
            tb.epp.a(r8)     // Catch: java.lang.Throwable -> Lb2
            if (r7 == 0) goto Lb1
            r7.close()     // Catch: java.io.IOException -> Lad
            goto Lb1
        Lad:
            r7 = move-exception
            tb.epp.a(r7)
        Lb1:
            return r3
        Lb2:
            r8 = move-exception
        Lb3:
            if (r7 == 0) goto Lbd
            r7.close()     // Catch: java.io.IOException -> Lb9
            goto Lbd
        Lb9:
            r7 = move-exception
            tb.epp.a(r7)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.mainpic.holder.e.a(java.lang.String, java.lang.String, android.graphics.Bitmap):boolean");
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        final Context k = this.f2738a.k();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.alibaba.android.ultron.vfw.widget.a.a(k, str);
        } else {
            this.f.post(new Runnable() { // from class: com.taobao.android.detail.mainpic.holder.e.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.alibaba.android.ultron.vfw.widget.a.a(k, str);
                    }
                }
            });
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        eus.a(this.c, this.h.m());
    }
}
