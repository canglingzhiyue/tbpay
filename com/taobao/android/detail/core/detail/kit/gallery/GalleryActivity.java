package com.taobao.android.detail.core.detail.kit.gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class GalleryActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f9530a;
    public ArrayList<GalleryModel> b;
    private b c;
    private ViewPager d;
    private TextView e;
    private TextView f;
    private TextView g;
    private DetailImageView h;

    public static /* synthetic */ Object ipc$super(GalleryActivity galleryActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public GalleryActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.detail.core.detail.kit.gallery.GalleryActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
        this.b = new ArrayList<>();
    }

    public static /* synthetic */ DetailImageView a(GalleryActivity galleryActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("348e9e50", new Object[]{galleryActivity}) : galleryActivity.h;
    }

    public static /* synthetic */ void a(GalleryActivity galleryActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e489d5fc", new Object[]{galleryActivity, new Integer(i)});
        } else {
            galleryActivity.a(i);
        }
    }

    public static /* synthetic */ TextView b(GalleryActivity galleryActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("e116c53a", new Object[]{galleryActivity}) : galleryActivity.f;
    }

    static {
        kge.a(1981414642);
        f9530a = "key_pic_model";
    }

    public static void a(Activity activity, ArrayList<GalleryModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d652c30", new Object[]{activity, arrayList});
        } else if (activity == null) {
        } else {
            Intent intent = new Intent();
            intent.putExtra(f9530a, arrayList);
            intent.setClass(activity, GalleryActivity.class);
            activity.startActivity(intent);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().requestFeature(9);
        setContentView(R.layout.x_detail_gallery_activity);
        if (getIntent().hasExtra(f9530a)) {
            this.b = (ArrayList) getIntent().getSerializableExtra(f9530a);
        }
        this.d = (ViewPager) findViewById(R.id.tao_kit_big_gallery);
        this.e = (TextView) findViewById(R.id.tao_kit_gallery_index_tv);
        this.f = (TextView) findViewById(R.id.tao_kit_gallery_title_tv);
        this.g = (TextView) findViewById(R.id.tao_kit_gallery_content_tv);
        this.h = (DetailImageView) findViewById(R.id.iv_desc_title);
        this.c = new b(this, R.layout.x_detail_gallery_image);
        this.c.a(a());
        this.c.a(new c() { // from class: com.taobao.android.detail.core.detail.kit.gallery.GalleryActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.kit.gallery.c
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    GalleryActivity.this.finish();
                }
            }
        });
        this.d.setAdapter(this.c);
        this.d.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.detail.core.detail.kit.gallery.GalleryActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else {
                    GalleryActivity.a(GalleryActivity.this, i);
                }
            }
        });
        this.d.setCurrentItem(0);
        a(0);
        emu.a("com.taobao.android.detail.core.detail.kit.gallery.GalleryActivity");
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        GalleryModel galleryModel = this.b.get(i);
        a(i, this.c.getCount());
        this.f.setText(galleryModel.title);
        this.g.setText(galleryModel.desc);
        if (TextUtils.isEmpty(galleryModel.headDescPicPath)) {
            this.h.setVisibility(8);
        } else {
            com.taobao.android.detail.core.detail.kit.utils.f.a(this).a(this.h, galleryModel.headDescPicPath, null, new com.taobao.android.detail.datasdk.protocol.image.b() { // from class: com.taobao.android.detail.core.detail.kit.gallery.GalleryActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.protocol.image.b
                public void onFailure(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("15b99301", new Object[]{this, aVar});
                    }
                }

                @Override // com.taobao.android.detail.datasdk.protocol.image.b
                public void onSuccess(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a8e27a", new Object[]{this, aVar});
                        return;
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) GalleryActivity.a(GalleryActivity.this).getLayoutParams();
                    layoutParams.height = GalleryActivity.b(GalleryActivity.this).getHeight() - com.taobao.android.detail.core.detail.kit.utils.b.a(GalleryActivity.this, 7.0f);
                    layoutParams.width = layoutParams.height * 5;
                    GalleryActivity.a(GalleryActivity.this).setLayoutParams(layoutParams);
                }
            });
        }
    }

    private ArrayList<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<GalleryModel> it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().picPath);
        }
        return arrayList;
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.e.setText(String.format("%d/%d", Integer.valueOf(i + 1), Integer.valueOf(i2)));
        }
    }
}
