package com.alipay.android.msp.ui.widget.gifimage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import tb.riy;

/* loaded from: classes3.dex */
public class GifImagePlugin extends AbsFBPlugin implements FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView b;
    private String c;
    private double d;
    private double e;
    private boolean f = false;
    private boolean g = false;
    private Context h;

    public static /* synthetic */ Object ipc$super(GifImagePlugin gifImagePlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1305055005) {
            if (hashCode != -740778895) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        return new Boolean(super.onLoadFinish());
    }

    @Override // com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(GifImagePlugin gifImagePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3bb381", new Object[]{gifImagePlugin});
        } else {
            gifImagePlugin.b();
        }
    }

    public GifImagePlugin(Context context) {
        this.h = context;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.b = new FBBorderImg(context);
        this.b.setScaleType(ImageView.ScaleType.FIT_XY);
        this.d = -1.0d;
        this.e = -1.0d;
        return this.b;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3d89c71", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue() : super.setRect(f, f2, f3, f4);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c310ec99", new Object[]{this, str, str2})).booleanValue();
        }
        this.b.setVisibility(0);
        if (StringUtils.equals(str, "-webkit-filter") || StringUtils.equals(str, "webkitFilter")) {
            int indexOf = str2.indexOf(riy.BRACKET_START_STR);
            String replace = (indexOf > 0 ? str2.substring(indexOf + 1) : str2).replace(riy.BRACKET_END_STR, "");
            if (str2.startsWith(Constants.Event.BLUR)) {
                a(replace);
            } else if (str2.startsWith("grayscale")) {
                this.f = StringUtils.equals(replace, "1");
            }
            str2 = replace;
        }
        if (StringUtils.equals(str, "visibility-display") && StringUtils.equals(str2, "hidden")) {
            ((FBBorderImg) this.b).resetWheelHelper("");
            this.b.setVisibility(8);
            LogUtil.record(1, "phonecashier", "GifImagePlugin", "updateCSS");
        }
        return true;
    }

    private static DisplayMetrics a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("1f64c183", new Object[]{context});
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    private double a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c20", new Object[]{this, str})).doubleValue();
        }
        if (str.contains("PX")) {
            return Double.parseDouble(str.replace("PX", "").trim());
        }
        return a(this.h).density * Double.parseDouble(str.replace("px", "").trim());
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        LogUtil.record(1, "GifImagePlugin:updateAttr", "key=" + str + " value=" + str2);
        if (str.equals("src")) {
            if (!((FBBorderImg) this.b).resetWheelHelper(str2)) {
                if (StringUtils.equals(str2, "indicatior")) {
                    this.g = true;
                    str2 = "";
                } else {
                    this.g = false;
                }
                this.c = str2;
                if (this.b.getVisibility() == 0) {
                    a();
                }
            }
        } else if (str.equals("srcheight")) {
            this.d = a(str2);
        } else if (str.equals("srcwidth")) {
            this.e = a(str2);
        } else if (!StringUtils.equals(str, "defaultvalue") && !StringUtils.equals(str, "failurevalue")) {
            if (StringUtils.equals("imageGray", str)) {
                this.f = Boolean.parseBoolean(str2);
            } else if (StringUtils.equals(str, "contentmode") && !StringUtils.isEmpty(str2)) {
                if (StringUtils.equals("ScaleToFill", str2)) {
                    this.b.setScaleType(ImageView.ScaleType.FIT_XY);
                } else if (StringUtils.equals("ScaleAspectFit", str2)) {
                    this.b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (StringUtils.equals("ScaleAspectFill", str2)) {
                    this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else if (StringUtils.equals("ScaleAspectAuto", str2)) {
                    this.b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (StringUtils.equals("Center", str2)) {
                    this.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
            }
        }
        return true;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23670e3", new Object[]{this})).booleanValue();
        }
        super.onLoadFinish();
        a();
        return true;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b.post(new Runnable() { // from class: com.alipay.android.msp.ui.widget.gifimage.GifImagePlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GifImagePlugin.a(GifImagePlugin.this);
                    }
                }
            });
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g) {
            this.b.setImageResource(R.drawable.alipay_msp_indicatior_loading);
        } else {
            a(this.c, MspContextUtil.getContext(), this.b);
        }
    }

    private void a(String str, Context context, ImageView imageView) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae3c810", new Object[]{this, str, context, imageView});
        } else if (StringUtils.isEmpty(str) || (indexOf = str.indexOf("/")) == -1) {
        } else {
            String substring = str.substring(0, indexOf);
            if (StringUtils.isEmpty(substring)) {
                substring = context.getPackageName();
            }
            String substring2 = str.substring(indexOf + 1);
            if (StringUtils.isEmpty(substring2) || StringUtils.isEmpty(substring)) {
                return;
            }
            int indexOf2 = substring2.indexOf(".");
            if (indexOf2 >= 0) {
                substring2 = substring2.substring(0, indexOf2);
            }
            int resourceId = ResUtils.getResourceId(substring2, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, substring);
            if (resourceId != 0 && resourceId != -1) {
                AnimationDrawable animationDrawable = (AnimationDrawable) context.getResources().getDrawable(resourceId);
                imageView.setImageDrawable(animationDrawable);
                animationDrawable.start();
                LogUtil.record(1, "GifImagePlugin:loadImgWithDrawable", str);
                return;
            }
            LogUtil.record(1, "GifImagePlugin:loadImgWithCodeImpl", str);
        }
    }

    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}
