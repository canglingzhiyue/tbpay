package tb;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.BackgroundColorSelector;
import com.tmall.stylekit.datatype.BorderSelector;
import com.tmall.stylekit.datatype.GradientColorVO;
import com.tmall.stylekit.datatype.MarginVO;
import com.tmall.stylekit.datatype.PaddingVO;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public class rmj extends rmg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2133325695);
    }

    public static /* synthetic */ Object ipc$super(rmj rmjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i <= 0 || i > 19) {
            return 0;
        }
        switch (i) {
            case 1:
            case 4:
            case 7:
            case 11:
            case 14:
            case 17:
                return 3;
            case 2:
            case 5:
            case 8:
            case 12:
            case 15:
            case 18:
                return 1;
            case 3:
            case 6:
            case 9:
            case 13:
            case 16:
            case 19:
                return 5;
            case 10:
            default:
                return 0;
        }
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i <= 0 || i > 19) {
            return 0;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 11:
            case 12:
            case 13:
                return 48;
            case 4:
            case 5:
            case 6:
            case 14:
            case 15:
            case 16:
                return 16;
            case 7:
            case 8:
            case 9:
            case 17:
            case 18:
            case 19:
                return 80;
            case 10:
            default:
                return 0;
        }
    }

    @Override // tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof View)) {
        } else {
            View view = (View) obj;
            String str4 = rlz.a().g(str3).get(str2);
            if (!StringUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (view == null || hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(view, hashMap, rlwVar);
        }
    }

    @Override // tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof View) || (view = (View) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(view, hashMap, rlwVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(View view, HashMap<String, Object> hashMap, rlw rlwVar) {
        String str;
        Iterator<Map.Entry<String, Object>> it;
        JSONArray jSONArray;
        String str2 = "colors";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8f5cdc", new Object[]{this, view, hashMap, rlwVar});
        } else if (view == null || hashMap == null || hashMap.size() == 0) {
        } else {
            Iterator<Map.Entry<String, Object>> it2 = hashMap.entrySet().iterator();
            MarginVO marginVO = null;
            PaddingVO paddingVO = null;
            rlq rlqVar = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it2.hasNext()) {
                Map.Entry<String, Object> next = it2.next();
                String valueOf = String.valueOf(next.getKey());
                if (!StringUtils.isEmpty(valueOf)) {
                    Object value = next.getValue();
                    try {
                        int a2 = rlp.a(valueOf);
                        if (a2 == 10210) {
                            str = str2;
                            it = it2;
                            view.setMinimumHeight(rmm.f(value.toString()));
                        } else if (a2 != 10211) {
                            switch (a2) {
                                case 10002:
                                    str = str2;
                                    it = it2;
                                    a(view, Integer.parseInt(value.toString()));
                                    break;
                                case 10003:
                                    str = str2;
                                    it = it2;
                                    BackgroundColorSelector backgroundColorSelector = (BackgroundColorSelector) rlz.a().a((JSONObject) value, BackgroundColorSelector.class);
                                    if (backgroundColorSelector == null) {
                                        break;
                                    } else {
                                        if (rlqVar == null) {
                                            rlqVar = new rlq();
                                        }
                                        rlqVar.b(rmm.a(backgroundColorSelector.backgroundNormalColor));
                                        rlqVar.d(rmm.a(backgroundColorSelector.backgroundSelectedColor));
                                        rlqVar.c(rmm.a(backgroundColorSelector.backgroundHighlightedColor));
                                        rlqVar.e(rmm.a(backgroundColorSelector.backgroundDisabledColor));
                                        break;
                                    }
                                case 10004:
                                    str = str2;
                                    it = it2;
                                    if (rlqVar == null) {
                                        rlqVar = new rlq();
                                    }
                                    rlqVar.f(rmm.a(value.toString()));
                                    break;
                                case 10005:
                                    str = str2;
                                    it = it2;
                                    String obj = value.toString();
                                    if (obj.startsWith(rmm.DRAWABLE_RESOURCE)) {
                                        a(view, rmm.d(obj));
                                        break;
                                    } else if (rlz.a().c() == null) {
                                        break;
                                    } else {
                                        rlz.a();
                                        value.toString();
                                        break;
                                    }
                                case 10006:
                                case 10007:
                                    str = str2;
                                    it = it2;
                                    i = rmm.f(value.toString());
                                    break;
                                case 10008:
                                case 10009:
                                    str = str2;
                                    it = it2;
                                    i2 = rmm.f(value.toString());
                                    break;
                                case 10010:
                                    str = str2;
                                    it = it2;
                                    paddingVO = (PaddingVO) rlz.a().a((JSONObject) value, PaddingVO.class);
                                    break;
                                case 10011:
                                case 10012:
                                    str = str2;
                                    it = it2;
                                    marginVO = (MarginVO) rlz.a().a((JSONObject) value, MarginVO.class);
                                    break;
                                case 10013:
                                case rlp.T_BORDER_WIDTH /* 10014 */:
                                    str = str2;
                                    it = it2;
                                    i3 = rmm.f(value.toString());
                                    if (i3 > 0) {
                                        if (rlqVar == null) {
                                            rlqVar = new rlq();
                                        }
                                        rlqVar.a(i3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10015:
                                case 10016:
                                    str = str2;
                                    it = it2;
                                    if (rlqVar == null) {
                                        rlqVar = new rlq();
                                    }
                                    rlqVar.a(rmm.a(value.toString()));
                                    break;
                                case rlp.T_BORDER_SELECTOR /* 10017 */:
                                    str = str2;
                                    it = it2;
                                    BorderSelector borderSelector = (BorderSelector) rlz.a().a((JSONObject) value, BorderSelector.class);
                                    if (borderSelector == null) {
                                        break;
                                    } else {
                                        if (rlqVar == null) {
                                            rlqVar = new rlq();
                                        }
                                        rlqVar.g(rmm.a(borderSelector.borderNormalColor));
                                        rlqVar.i(rmm.a(borderSelector.borderSelectedColor));
                                        rlqVar.h(rmm.a(borderSelector.borderHighlightedColor));
                                        rlqVar.j(rmm.a(borderSelector.borderDisabledColor));
                                        break;
                                    }
                                case 10018:
                                    str = str2;
                                    it = it2;
                                    if (rlqVar == null) {
                                        rlqVar = new rlq();
                                    }
                                    rlqVar.b(rmm.f(value.toString()));
                                    break;
                                case 10019:
                                    JSONObject parseObject = JSONObject.parseObject(value.toString());
                                    if (parseObject.containsKey(str2) && (jSONArray = parseObject.getJSONArray(str2)) != null && jSONArray.size() != 0) {
                                        GradientColorVO gradientColorVO = new GradientColorVO();
                                        int size = jSONArray.size();
                                        str = str2;
                                        try {
                                            gradientColorVO.colors = new int[size];
                                            int i5 = 0;
                                            while (i5 < size) {
                                                it = it2;
                                                try {
                                                    gradientColorVO.colors[i5] = Color.parseColor(jSONArray.get(i5).toString());
                                                    i5++;
                                                    it2 = it;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    rmn.a(th);
                                                    it2 = it;
                                                    str2 = str;
                                                }
                                            }
                                            it = it2;
                                            if (parseObject.containsKey("type")) {
                                                gradientColorVO.type = Integer.parseInt(parseObject.get("type").toString());
                                            }
                                            if (rlqVar == null) {
                                                rlqVar = new rlq();
                                            }
                                            rlqVar.a(gradientColorVO);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            it = it2;
                                            rmn.a(th);
                                            it2 = it;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 10020:
                                    view.setAlpha(Float.parseFloat(value.toString()));
                                    break;
                                case 10021:
                                    i4 = Integer.parseInt(value.toString());
                                    break;
                            }
                        } else {
                            str = str2;
                            it = it2;
                            view.setMinimumWidth(rmm.f(value.toString()));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                    }
                    it2 = it;
                    str2 = str;
                }
                str = str2;
                it = it2;
                it2 = it;
                str2 = str;
            }
            a(view, i, i2, i3, 0, i4, marginVO);
            if (paddingVO != null) {
                a(view, paddingVO);
            }
            if (rlqVar == null) {
                return;
            }
            a(view, rlqVar.a(view));
        }
    }

    private void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (i == -1) {
            view.setVisibility(4);
        } else if (i == 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5, MarginVO marginVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4ad52b", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), marginVO});
            return;
        }
        View view2 = (View) view.getParent();
        if (i > 0) {
            i = (int) (i + i3);
        }
        if (i2 > 0) {
            i2 = (int) (i2 + i3);
        }
        if (view2 == null) {
            if (marginVO == null) {
                return;
            }
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (i >= -2 && i != 0) {
                    marginLayoutParams.width = i;
                }
                if (i2 >= -2 && i2 != 0) {
                    marginLayoutParams.height = i2;
                }
                if (marginVO != null) {
                    marginLayoutParams.setMargins(rmm.f(marginVO.marginLeft), rmm.f(marginVO.marginTop), rmm.f(marginVO.marginRight), rmm.f(marginVO.marginBottom));
                }
                if (view instanceof LinearLayout) {
                    ((LinearLayout) view).setGravity(b(i5));
                }
                view.setLayoutParams(marginLayoutParams);
            } catch (Throwable unused) {
            }
        } else if (view2 instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            }
            if (i >= -2 && i != 0) {
                layoutParams.width = i;
            }
            if (i2 >= -2 && i2 != 0) {
                layoutParams.height = i2;
            }
            if (marginVO != null) {
                layoutParams.setMargins(rmm.f(marginVO.marginLeft), rmm.f(marginVO.marginTop), rmm.f(marginVO.marginRight), rmm.f(marginVO.marginBottom));
            }
            float f = i4;
            if (f > 0.0f) {
                layoutParams.weight = f;
            }
            if (view instanceof LinearLayout) {
                ((LinearLayout) view).setGravity(b(i5));
            }
            view.setLayoutParams(layoutParams);
        } else if (view2 instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            }
            if (i >= -2 && i != 0) {
                layoutParams2.width = i;
            }
            if (i2 >= -2 && i2 != 0) {
                layoutParams2.height = i2;
            }
            if (view instanceof LinearLayout) {
                ((LinearLayout) view).setGravity(b(i5));
            }
            if (marginVO != null) {
                layoutParams2.setMargins(rmm.f(marginVO.marginLeft), rmm.f(marginVO.marginTop), rmm.f(marginVO.marginRight), rmm.f(marginVO.marginBottom));
            }
            view.setLayoutParams(layoutParams2);
        } else if (view2 instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            }
            if (i >= -2 && i != 0) {
                layoutParams3.width = i;
            }
            if (i2 >= -2 && i2 != 0) {
                layoutParams3.height = i2;
            }
            layoutParams3.gravity = 48;
            if (view instanceof LinearLayout) {
                ((LinearLayout) view).setGravity(b(i5));
            }
            if (marginVO != null) {
                layoutParams3.setMargins(rmm.f(marginVO.marginLeft), rmm.f(marginVO.marginTop), rmm.f(marginVO.marginRight), rmm.f(marginVO.marginBottom));
            }
            view.setLayoutParams(layoutParams3);
        } else if (!(view2 instanceof ListView)) {
        } else {
            AbsListView.LayoutParams layoutParams4 = (AbsListView.LayoutParams) view.getLayoutParams();
            if (layoutParams4 == null) {
                layoutParams4 = new AbsListView.LayoutParams(-2, -2);
            }
            if (i >= -2 && i != 0) {
                layoutParams4.width = i;
            }
            if (i2 >= -2 && i2 != 0) {
                layoutParams4.height = i2;
            }
            if (view instanceof LinearLayout) {
                ((LinearLayout) view).setGravity(b(i5));
            }
            view.setLayoutParams(layoutParams4);
        }
    }

    private void a(View view, PaddingVO paddingVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a5c523", new Object[]{this, view, paddingVO});
        } else {
            view.setPadding(rmm.f(paddingVO.paddingLeft), rmm.f(paddingVO.paddingTop), rmm.f(paddingVO.paddingRight), rmm.f(paddingVO.paddingBottom));
        }
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : a(i) | c(i);
    }

    private static void a(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b9198e", new Object[]{view, drawable});
        } else if (view == null || drawable == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 16) {
                view.setBackground(drawable);
            } else {
                view.setBackgroundDrawable(drawable);
            }
        }
    }
}
