package com.alibaba.android.split.core.splitcompat;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.ResourcesImpl;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.alibaba.android.split.v;
import com.alibaba.android.split.w;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.xmlpull.v1.XmlPullParserException;
import tb.kge;

/* loaded from: classes2.dex */
public class FlexaResources extends Resources {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Reflector f2445a;
    private static AssetManager b;
    private static List<String> c;
    private static Set<String> d;
    private Resources e;
    private w f;

    public static /* synthetic */ Object ipc$super(FlexaResources flexaResources, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2111110055:
                return super.getStringArray(((Number) objArr[0]).intValue());
            case -2083320178:
                return super.getLayout(((Number) objArr[0]).intValue());
            case -1935838630:
                return super.getColorStateList(((Number) objArr[0]).intValue());
            case -1501686619:
                return super.getQuantityText(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case -1483807804:
                return super.getString(((Number) objArr[0]).intValue(), (Object[]) objArr[1]);
            case -1392410159:
                super.parseBundleExtras((XmlResourceParser) objArr[0], (Bundle) objArr[1]);
                return null;
            case -1349695011:
                return super.getText(((Number) objArr[0]).intValue(), (CharSequence) objArr[1]);
            case -1289303305:
                return new Integer(super.getIdentifier((String) objArr[0], (String) objArr[1], (String) objArr[2]));
            case -1159495904:
                return super.getAnimation(((Number) objArr[0]).intValue());
            case -1090998665:
                super.updateConfiguration((Configuration) objArr[0], (DisplayMetrics) objArr[1]);
                return null;
            case -978891697:
                return super.getTextArray(((Number) objArr[0]).intValue());
            case -695018968:
                return super.getIntArray(((Number) objArr[0]).intValue());
            case -576565604:
                return new Float(super.getDimension(((Number) objArr[0]).intValue()));
            case -468787923:
                return super.getXml(((Number) objArr[0]).intValue());
            case -436736815:
                return super.getResourcePackageName(((Number) objArr[0]).intValue());
            case -329272601:
                return super.getConfiguration();
            case -232347918:
                return super.getDrawable(((Number) objArr[0]).intValue());
            case -207995225:
                return super.getQuantityString(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case -147011149:
                return super.getResourceName(((Number) objArr[0]).intValue());
            case -41119543:
                return super.obtainTypedArray(((Number) objArr[0]).intValue());
            case -2121164:
                return new Float(super.getFraction(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            case 18746696:
                super.getValue(((Number) objArr[0]).intValue(), (TypedValue) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 29277574:
                return super.getDrawable(((Number) objArr[0]).intValue(), (Resources.Theme) objArr[1]);
            case 35169555:
                super.getValue((String) objArr[0], (TypedValue) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 41588160:
                return super.openRawResource(((Number) objArr[0]).intValue(), (TypedValue) objArr[1]);
            case 69782135:
                return super.getMovie(((Number) objArr[0]).intValue());
            case 114450360:
                return super.getDrawableForDensity(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Resources.Theme) objArr[2]);
            case 235474573:
                return super.getResourceTypeName(((Number) objArr[0]).intValue());
            case 323816587:
                return super.getString(((Number) objArr[0]).intValue());
            case 540540590:
                return new Boolean(super.getBoolean(((Number) objArr[0]).intValue()));
            case 586000199:
                return new Integer(super.getInteger(((Number) objArr[0]).intValue()));
            case 832519784:
                super.getValueForDensity(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (TypedValue) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 867427368:
                return super.getQuantityString(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Object[]) objArr[2]);
            case 918399229:
                return super.getResourceEntryName(((Number) objArr[0]).intValue());
            case 929867136:
                return super.getDrawableForDensity(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case 944385474:
                return new Integer(super.getColor(((Number) objArr[0]).intValue()));
            case 1065143297:
                return super.getText(((Number) objArr[0]).intValue());
            case 1150550317:
                return super.openRawResourceFd(((Number) objArr[0]).intValue());
            case 1223062232:
                return new Integer(super.getDimensionPixelSize(((Number) objArr[0]).intValue()));
            case 1342203443:
                return super.openRawResource(((Number) objArr[0]).intValue());
            case 1736557528:
                return super.obtainAttributes((AttributeSet) objArr[0], (int[]) objArr[1]);
            case 1866983174:
                return new Integer(super.getDimensionPixelOffset(((Number) objArr[0]).intValue()));
            case 2001815890:
                super.parseBundleExtra((String) objArr[0], (AttributeSet) objArr[1], (Bundle) objArr[2]);
                return null;
            case 2147328961:
                return super.getDisplayMetrics();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(348003658);
        f2445a = null;
        c = new ArrayList();
        d = new CopyOnWriteArraySet();
        c.add("ttid");
        c.add("build_id");
        c.add("project_id");
        c.add("packageTag");
        c.add("base_version");
        c.add("publish_type");
        c.add("package_type");
        try {
            b = (AssetManager) AssetManager.class.newInstance();
            f2445a = Reflector.a((Class<?>) AssetManager.class).a("addAssetPath", String.class).c(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context) {
        if ((!Build.MODEL.equalsIgnoreCase("PBEM00") || Build.VERSION.SDK_INT != 29) && Build.VERSION.SDK_INT != 28 && v.j(context)) {
            if (context.getClass().getName().equals("android.app.ContextImpl")) {
                b(context);
            } else if (!(context instanceof ContextWrapper)) {
            } else {
                try {
                    Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
                    declaredField.setAccessible(true);
                    b((Context) declaredField.get(context));
                } catch (Exception unused) {
                }
            }
        }
    }

    public ResourcesImpl getImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourcesImpl) ipChange.ipc$dispatch("763fb4ae", new Object[]{this});
        }
        Resources resources = this.e;
        if (resources != null) {
            return b(resources);
        }
        return b(this);
    }

    public void setImpl(ResourcesImpl resourcesImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e4ecd8", new Object[]{this, resourcesImpl});
            return;
        }
        Resources resources = this.e;
        if (resources != null) {
            a(resources, resourcesImpl);
        } else {
            a(this, resourcesImpl);
        }
    }

    private void a(Resources resources, ResourcesImpl resourcesImpl) {
        try {
            Method declaredMethod = Resources.class.getDeclaredMethod("setImpl", ResourcesImpl.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(resources, resourcesImpl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ResourcesImpl b(Resources resources) {
        try {
            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
            declaredField.setAccessible(true);
            return (ResourcesImpl) declaredField.get(resources);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void b(Context context) {
        try {
            Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mResources");
            declaredField.setAccessible(true);
            Resources resources = (Resources) declaredField.get(context);
            if (resources instanceof FlexaResources) {
                return;
            }
            FlexaResources flexaResources = new FlexaResources(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
            flexaResources.a(resources);
            declaredField.set(context, flexaResources);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a42f3f9", new Object[]{this, resources});
        } else {
            this.e = resources;
        }
    }

    public FlexaResources(AssetManager assetManager, DisplayMetrics displayMetrics, Configuration configuration) {
        super(assetManager, displayMetrics, configuration);
        this.f = (w) com.alibaba.android.split.a.a((Class<? extends Object>) w.class, new Object[0]);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3f7ccc01", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getText(i);
        }
        return super.getText(i);
    }

    @Override // android.content.res.Resources
    public Typeface getFont(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("9cf736ed", new Object[]{this, new Integer(i)});
        }
        if (this.e != null && Build.VERSION.SDK_INT >= 26) {
            return this.e.getFont(i);
        }
        return super.getFont(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a67e14a5", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getQuantityText(i, i2);
        }
        return super.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getString(i);
        }
        return super.getString(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a78ee3c4", new Object[]{this, new Integer(i), objArr});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getString(i, objArr);
        }
        return super.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33b3e428", new Object[]{this, new Integer(i), new Integer(i2), objArr});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getQuantityString(i, i2, objArr);
        }
        return super.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f39a3ea7", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getQuantityString(i, i2);
        }
        return super.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("af8d49dd", new Object[]{this, new Integer(i), charSequence});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getText(i, charSequence);
        }
        return super.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence[]) ipChange.ipc$dispatch("c5a74c4f", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getTextArray(i);
        }
        return super.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("822b0459", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getStringArray(i);
        }
        return super.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("d692da28", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getIntArray(i);
        }
        return super.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedArray) ipChange.ipc$dispatch("fd8c90c9", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.obtainTypedArray(i);
        }
        return super.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dda24e9c", new Object[]{this, new Integer(i)})).floatValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getDimension(i);
        }
        return super.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f47e706", new Object[]{this, new Integer(i)})).intValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getDimensionPixelOffset(i);
        }
        return super.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48e672d8", new Object[]{this, new Integer(i)})).intValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getDimensionPixelSize(i);
        }
        return super.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffdfa234", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).floatValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getFraction(i, i2, i3);
        }
        return super.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f226a6f2", new Object[]{this, new Integer(i)});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, i);
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getDrawable(i);
        }
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("1bebd86", new Object[]{this, new Integer(i), theme});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, i);
        }
        if (this.e != null && Build.VERSION.SDK_INT >= 21) {
            return this.e.getDrawable(i, theme);
        }
        return super.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("376ca580", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getDrawableForDensity(i, i2);
        }
        return super.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6d25fb8", new Object[]{this, new Integer(i), new Integer(i2), theme});
        }
        if (this.e != null && Build.VERSION.SDK_INT >= 21) {
            return this.e.getDrawableForDensity(i, i2, theme);
        }
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Movie) ipChange.ipc$dispatch("428ca77", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getMovie(i);
        }
        return super.getMovie(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("384a2dc2", new Object[]{this, new Integer(i)})).intValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getColor(i);
        }
        return super.getColor(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7de93800", new Object[]{this, new Integer(i), theme})).intValue();
        }
        if (this.e != null && Build.VERSION.SDK_INT >= 23) {
            return this.e.getColor(i, theme);
        }
        return super.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("8c9d725a", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getColorStateList(i);
        }
        return super.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("e7e9a692", new Object[]{this, new Integer(i), theme});
        }
        if (this.e != null && Build.VERSION.SDK_INT >= 23) {
            return this.e.getColorStateList(i, theme);
        }
        return super.getColorStateList(i, theme);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2037feae", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getBoolean(i);
        }
        return super.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22eda747", new Object[]{this, new Integer(i)})).intValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getInteger(i);
        }
        return super.getInteger(i);
    }

    @Override // android.content.res.Resources
    public float getFloat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aecf2e66", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (this.e != null && Build.VERSION.SDK_INT >= 29) {
            return this.e.getFloat(i);
        }
        return super.getFloat(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("83d30e8e", new Object[]{this, new Integer(i)});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a("layout", i);
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getLayout(i);
        }
        return super.getLayout(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("bae37f20", new Object[]{this, new Integer(i)});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a("animation", i);
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getAnimation(i);
        }
        return super.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("e40edd2d", new Object[]{this, new Integer(i)});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a("xml", i);
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getXml(i);
        }
        return super.getXml(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("50006633", new Object[]{this, new Integer(i)});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a(com.taobao.android.weex_framework.util.a.ATOM_raw, i);
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.openRawResource(i);
        }
        return super.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("27a95c0", new Object[]{this, new Integer(i), typedValue});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a(com.taobao.android.weex_framework.util.a.ATOM_raw, i);
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.openRawResource(i, typedValue);
        }
        return super.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("4494012d", new Object[]{this, new Integer(i)});
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.a(com.taobao.android.weex_framework.util.a.ATOM_raw, i);
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.openRawResourceFd(i);
        }
        return super.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e0d48", new Object[]{this, new Integer(i), typedValue, new Boolean(z)});
            return;
        }
        Resources resources = this.e;
        if (resources != null) {
            resources.getValue(i, typedValue, z);
        }
        super.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319f3e68", new Object[]{this, new Integer(i), new Integer(i2), typedValue, new Boolean(z)});
            return;
        }
        Resources resources = this.e;
        if (resources != null) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
        super.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218a513", new Object[]{this, str, typedValue, new Boolean(z)});
            return;
        }
        Resources resources = this.e;
        if (resources != null) {
            resources.getValue(str, typedValue, z);
        }
        super.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedArray) ipChange.ipc$dispatch("6781c3d8", new Object[]{this, attributeSet, iArr});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef8ae77", new Object[]{this, configuration, displayMetrics});
            return;
        }
        Resources resources = this.e;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("7ffda3c1", new Object[]{this});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getDisplayMetrics();
        }
        return super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration) ipChange.ipc$dispatch("ec5fb2e7", new Object[]{this});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getConfiguration();
        }
        return super.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b326caf7", new Object[]{this, str, str2, str3})).intValue();
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getIdentifier(str, str2, str3);
        }
        return super.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f73cc9b3", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getResourceName(i);
        }
        return super.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5f7ecd1", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getResourcePackageName(i);
        }
        return super.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e090e8d", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getResourceTypeName(i);
        }
        return super.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36bda8fd", new Object[]{this, new Integer(i)});
        }
        Resources resources = this.e;
        if (resources != null) {
            return resources.getResourceEntryName(i);
        }
        return super.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws IOException, XmlPullParserException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0181d1", new Object[]{this, xmlResourceParser, bundle});
            return;
        }
        Resources resources = this.e;
        if (resources != null) {
            resources.parseBundleExtras(xmlResourceParser, bundle);
        }
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77514952", new Object[]{this, str, attributeSet, bundle});
            return;
        }
        Resources resources = this.e;
        if (resources != null) {
            resources.parseBundleExtra(str, attributeSet, bundle);
        }
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    public static int proxy_getIdentifier(Resources resources, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7488bd7d", new Object[]{resources, str, str2, str3})).intValue();
        }
        if (j.h().f().size() <= 0) {
            return 0;
        }
        for (String str4 : j.h().f()) {
            try {
                String absolutePath = com.alibaba.android.split.core.plugin.g.a(j.h().n()).b(str4).a().getAbsolutePath();
                synchronized (d) {
                    if (!d.contains(absolutePath) && ((Integer) f2445a.b(com.alibaba.android.split.core.plugin.g.a(j.h().n()).b(str4).a().getAbsolutePath())).intValue() != 0) {
                        d.add(absolutePath);
                    }
                }
            } catch (Reflector.ReflectedException e) {
                e.printStackTrace();
            }
        }
        return new Resources(b, resources.getDisplayMetrics(), resources.getConfiguration()).getIdentifier(str, str2, str3);
    }
}
