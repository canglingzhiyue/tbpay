package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.AsyncTask;
import android.support.v7.widget.AppCompatCheckBox;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.expressionv2.i;
import com.taobao.android.dinamic.j;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpo;
import tb.fpq;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class DCheckBoxConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String D_CHECKED = "dChecked";
    private static final String D_CHECK_IMG = "dCheckImg";
    private static final String D_DISCHECK_IMG = "dDisCheckImg";
    private static final String D_DISUNCHECK_IMG = "dDisUnCheckImg";
    private static final String D_HEIGHT = "dHeight";
    private static final String D_UNCHECK_IMG = "dUncheckImg";
    private static final String D_WIDTH = "dWidth";
    private static final String VIEW_EVENT_ON_CHANGE = "onChange";
    public static final String VIEW_TAG = "DCheckBox";

    static {
        kge.a(1924188155);
    }

    public static /* synthetic */ Object ipc$super(DCheckBoxConstructor dCheckBoxConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        AppCompatCheckBox appCompatCheckBox = view instanceof AppCompatCheckBox ? (AppCompatCheckBox) view : null;
        if (arrayList.contains(D_WIDTH) || arrayList.contains(D_HEIGHT) || arrayList.contains(D_CHECK_IMG) || arrayList.contains(D_UNCHECK_IMG) || arrayList.contains(D_DISCHECK_IMG) || arrayList.contains(D_DISUNCHECK_IMG)) {
            int defaultSize = getDefaultSize(view.getContext());
            int defaultSize2 = getDefaultSize(view.getContext());
            Object obj = map.get(D_WIDTH);
            Object obj2 = map.get(D_HEIGHT);
            int a2 = fpr.a(view.getContext(), obj, -1);
            int a3 = fpr.a(view.getContext(), obj2, -1);
            if (a2 == -1 || a3 == -1) {
                i = defaultSize2;
                i2 = defaultSize;
            } else {
                i = a2;
                i2 = a3;
            }
            String str = (String) map.get(D_CHECK_IMG);
            String str2 = (String) view.getTag(j.ALREADY_INT_CHECK_IMG);
            if (str == null) {
                str = "dinamicx_checked";
            }
            String str3 = (String) map.get(D_UNCHECK_IMG);
            String str4 = (String) view.getTag(j.ALREADY_INT_UNCHECK_IMG);
            if (str3 == null) {
                str3 = "dinamicx_uncheck";
            }
            String str5 = str3;
            String str6 = (String) map.get(D_DISCHECK_IMG);
            String str7 = (String) view.getTag(j.ALREADY_INT_DIS_CHECK_IMG);
            if (str6 == null) {
                str6 = "dinamicx_discheck";
            }
            String str8 = str6;
            String str9 = (String) map.get(D_DISUNCHECK_IMG);
            String str10 = (String) view.getTag(j.ALREADY_INT_DIS_UNCHECK_IMG);
            if (str9 == null) {
                str9 = "dinamicx_disunchk";
            }
            if (str2 == null && str4 == null && str7 == null && str10 == null) {
                appCompatCheckBox.setButtonDrawable((Drawable) null);
            }
            if (!str.equals(str2) || !str5.equals(str4) || !str8.equals(str7) || !str9.equals(str10)) {
                view.setTag(j.NEED_INT_CHECK_IMG, str);
                view.setTag(j.NEED_INT_UNCHECK_IMG, str5);
                view.setTag(j.NEED_INT_DIS_CHECK_IMG, str8);
                view.setTag(j.NEED_INT_DIS_UNCHECK_IMG, str9);
                new b(appCompatCheckBox, str, str5, str8, str9, i, i2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
        if (arrayList.contains(D_CHECKED)) {
            setChecked(appCompatCheckBox, i.a((String) map.get(D_CHECKED)));
        }
        if (!arrayList.contains("dEnabled")) {
            return;
        }
        String str11 = (String) map.get("dEnabled");
        if (!StringUtils.isEmpty(str11)) {
            setEnable(view, i.a(str11));
        } else {
            setEnable(view, true);
        }
    }

    private void setEnable(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf338cce", new Object[]{this, view, new Boolean(z)});
        } else {
            view.setEnabled(z);
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends AsyncTask<Void, Void, Drawable[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11733a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        private Context g;
        private WeakReference<AppCompatCheckBox> h;

        static {
            kge.a(-1714625294);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.graphics.drawable.Drawable[]] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Drawable[] doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Drawable[] drawableArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, drawableArr});
            } else {
                a(drawableArr);
            }
        }

        public b(AppCompatCheckBox appCompatCheckBox, String str, String str2, String str3, String str4, int i, int i2) {
            this.f11733a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.g = appCompatCheckBox.getContext().getApplicationContext();
            this.f11733a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
            this.f = i2;
            this.h = new WeakReference<>(appCompatCheckBox);
        }

        public Drawable[] a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable[]) ipChange.ipc$dispatch("4cdcb47d", new Object[]{this, voidArr});
            }
            Drawable a2 = a(this.g, this.f11733a);
            if (a2 == null) {
                a2 = a(this.g, R.drawable.dinamicx_checked);
            }
            Drawable a3 = a(a2, this.g, this.e, this.f);
            Drawable a4 = a(this.g, this.b);
            if (a4 == null) {
                a4 = a(this.g, R.drawable.dinamicx_uncheck);
            }
            Drawable a5 = a(a4, this.g, this.e, this.f);
            Drawable a6 = a(this.g, this.c);
            if (a6 == null) {
                a6 = a(this.g, R.drawable.dinamicx_discheck);
            }
            Drawable a7 = a(a6, this.g, this.e, this.f);
            Drawable a8 = a(this.g, this.d);
            if (a8 == null) {
                a8 = a(this.g, R.drawable.dinamicx_disunchk);
            }
            return new Drawable[]{a3, a5, a7, a(a8, this.g, this.e, this.f)};
        }

        public void a(Drawable[] drawableArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6f1a7d1", new Object[]{this, drawableArr});
                return;
            }
            AppCompatCheckBox appCompatCheckBox = this.h.get();
            if (appCompatCheckBox == null) {
                return;
            }
            String str = (String) appCompatCheckBox.getTag(j.NEED_INT_CHECK_IMG);
            String str2 = (String) appCompatCheckBox.getTag(j.NEED_INT_UNCHECK_IMG);
            String str3 = (String) appCompatCheckBox.getTag(j.NEED_INT_DIS_CHECK_IMG);
            String str4 = (String) appCompatCheckBox.getTag(j.NEED_INT_DIS_UNCHECK_IMG);
            if (!str.equals(this.f11733a) || !str2.equals(this.b) || !str3.equals(this.c) || !str4.equals(this.d)) {
                return;
            }
            a(appCompatCheckBox, drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
            appCompatCheckBox.setTag(j.ALREADY_INT_CHECK_IMG, str);
            appCompatCheckBox.setTag(j.ALREADY_INT_UNCHECK_IMG, str2);
            appCompatCheckBox.setTag(j.ALREADY_INT_DIS_CHECK_IMG, str3);
            appCompatCheckBox.setTag(j.ALREADY_INT_DIS_UNCHECK_IMG, str4);
        }

        private Drawable a(Drawable drawable, Context context, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("de6a2d1e", new Object[]{this, drawable, context, new Integer(i), new Integer(i2)});
            }
            if (!(drawable instanceof BitmapDrawable)) {
                return null;
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmap, i, i2, true));
            bitmapDrawable.setTargetDensity(bitmap.getDensity());
            return bitmapDrawable;
        }

        private void a(AppCompatCheckBox appCompatCheckBox, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63e04e40", new Object[]{this, appCompatCheckBox, drawable, drawable2, drawable3, drawable4});
            } else if (appCompatCheckBox == null) {
            } else {
                appCompatCheckBox.setButtonDrawable(a(drawable, drawable2, drawable3, drawable4));
            }
        }

        private Drawable a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("10bb7350", new Object[]{this, context, str});
            }
            try {
                return context.getResources().getDrawable(context.getResources().getIdentifier(str, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName()));
            } catch (Throwable unused) {
                return null;
            }
        }

        private Drawable a(Context context, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("da293437", new Object[]{this, context, new Integer(i)}) : context.getResources().getDrawable(i);
        }

        private StateListDrawable a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StateListDrawable) ipChange.ipc$dispatch("cbffbe89", new Object[]{this, drawable, drawable2, drawable3, drawable4}) : com.taobao.android.dinamic.constructor.b.a(drawable, drawable2, drawable3, drawable4);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setEvents(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a6a1c6", new Object[]{this, view, fpdVar});
        } else {
            new a().a(view, fpdVar);
        }
    }

    public void setChecked(AppCompatCheckBox appCompatCheckBox, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31266aa8", new Object[]{this, appCompatCheckBox, new Boolean(z)});
        } else if (appCompatCheckBox == null) {
        } else {
            appCompatCheckBox.setTag(R.id.change_with_attribute, "true");
            appCompatCheckBox.setChecked(z);
            appCompatCheckBox.setTag(R.id.change_with_attribute, "false");
        }
    }

    private int getDefaultSize(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e243e8", new Object[]{this, context})).intValue() : (int) TypedValue.applyDimension(1, 17.0f, context.getResources().getDisplayMetrics());
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        getDefaultSize(context);
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, attributeSet);
        appCompatCheckBox.setClickable(true);
        return appCompatCheckBox;
    }

    /* loaded from: classes5.dex */
    public static class a extends fpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(273679916);
        }

        private a() {
        }

        @Override // tb.fpo
        public void a(View view, fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb350c0", new Object[]{this, view, fpdVar});
            } else {
                b(view, fpdVar);
            }
        }

        public void b(View view, fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e3909f", new Object[]{this, view, fpdVar});
                return;
            }
            fpq fpqVar = (fpq) view.getTag(j.PROPERTY_KEY);
            if (fpqVar == null) {
                return;
            }
            Map<String, String> map = fpqVar.d;
            if (map.isEmpty() || !map.containsKey(DCheckBoxConstructor.VIEW_EVENT_ON_CHANGE) || !(view instanceof AppCompatCheckBox)) {
                return;
            }
            ((AppCompatCheckBox) view).setOnCheckedChangeListener(new OnChangeListener(this, fpdVar, fpqVar, view));
        }
    }

    /* loaded from: classes5.dex */
    public static class OnChangeListener implements CompoundButton.OnCheckedChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private fpd mDinamicParams;
        private a mHandler;
        private String mOnChangeExpression;
        private fpq mProperty;
        private View mView;

        static {
            kge.a(-120881684);
            kge.a(1381311248);
        }

        public OnChangeListener(a aVar, fpd fpdVar, fpq fpqVar, View view) {
            this.mHandler = aVar;
            this.mDinamicParams = fpdVar;
            this.mProperty = fpqVar;
            this.mView = view;
            Map<String, String> map = fpqVar.d;
            if (!map.isEmpty()) {
                this.mOnChangeExpression = map.get(DCheckBoxConstructor.VIEW_EVENT_ON_CHANGE);
            }
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                return;
            }
            Object tag = compoundButton.getTag(R.id.change_with_attribute);
            if (StringUtils.isEmpty(this.mOnChangeExpression) || "true".equals(tag)) {
                return;
            }
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(Boolean.valueOf(compoundButton.isChecked()));
            this.mView.setTag(j.VIEW_PARAMS, arrayList);
            a.b(this.mView, this.mDinamicParams, this.mProperty, this.mOnChangeExpression);
        }
    }
}
