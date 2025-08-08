package tb;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Html;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.FontColorSelectorVO;
import com.tmall.stylekit.datatype.FontVO;
import com.tmall.stylekit.datatype.ShadowVO;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rmi extends rmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Typeface f33234a = null;

    static {
        kge.a(-796970356);
    }

    public static /* synthetic */ Object ipc$super(rmi rmiVar, String str, Object... objArr) {
        if (str.hashCode() == -326148900) {
            super.a((View) objArr[0], (HashMap) objArr[1], (rlw) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, String str, String str2, rlw rlwVar, String str3) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605ad635", new Object[]{this, obj, str, str2, rlwVar, str3});
        } else if (!(obj instanceof TextView) || (textView = (TextView) obj) == null) {
        } else {
            String str4 = rlz.a().g(str3).get(str2);
            if (!StringUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = rlz.a().d(str, str3).get(str2);
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            a(textView, hashMap, rlwVar);
        }
    }

    @Override // tb.rmj, tb.rmg
    public void a(Object obj, HashMap<String, Object> hashMap, rlw rlwVar) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedfb5c2", new Object[]{this, obj, hashMap, rlwVar});
        } else if (!(obj instanceof TextView) || (textView = (TextView) obj) == null || hashMap == null || hashMap.size() == 0) {
        } else {
            a(textView, hashMap, rlwVar);
        }
    }

    public void a(TextView textView, HashMap<String, Object> hashMap, rlw rlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20386a2a", new Object[]{this, textView, hashMap, rlwVar});
        } else if (textView != null && hashMap != null && hashMap.size() != 0) {
            boolean z = false;
            float f = 1.0f;
            float f2 = 1.0f;
            FontVO fontVO = null;
            FontColorSelectorVO fontColorSelectorVO = null;
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                Object value = entry.getValue();
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (rlp.a(valueOf)) {
                    case 10102:
                    case 10103:
                        textView.setText(Html.fromHtml(rmm.b(value.toString())));
                        continue;
                    case 10104:
                    case 10105:
                        textView.setTextColor(rmm.a(value.toString()));
                        continue;
                    case rlp.T_FONT_COLOR_SELECTOR /* 10106 */:
                    case rlp.T_TITLE_COLOR_SELECTOR /* 10107 */:
                        fontColorSelectorVO = (FontColorSelectorVO) rlz.a().a((JSONObject) value, FontColorSelectorVO.class);
                        continue;
                    case rlp.T_FONT_WEIGHT /* 10108 */:
                        if (Integer.parseInt(value.toString()) > 400) {
                            textView.getPaint().setFakeBoldText(true);
                        } else {
                            continue;
                        }
                    case rlp.T_FAMILY_NAME /* 10109 */:
                    case 10110:
                        a(textView, value.toString());
                        continue;
                    case rlp.T_FONT_SIZE /* 10111 */:
                    case rlp.T_ICONFONT_SIZE /* 10112 */:
                        textView.setTextSize(0, rmm.e(value.toString()));
                        continue;
                    case rlp.T_FONT /* 10113 */:
                        FontVO fontVO2 = (FontVO) rlz.a().a((JSONObject) value, FontVO.class);
                        if (fontVO2 != null) {
                            try {
                                a(textView, fontVO2);
                            } catch (Throwable th2) {
                                th = th2;
                                fontVO = fontVO2;
                                break;
                            }
                        }
                        fontVO = fontVO2;
                        continue;
                    case rlp.T_DRAWABLE_TOP /* 10114 */:
                    case rlp.T_DRAWABLE_BOTTOM /* 10115 */:
                    case rlp.T_DRAWABLE_LEFT /* 10116 */:
                    case rlp.T_DRAWABLE_RIGHT /* 10117 */:
                    default:
                        continue;
                    case rlp.T_TRUNCATE_MODE /* 10118 */:
                        b(textView, value.toString());
                        continue;
                    case 10119:
                        textView.setGravity(b(Integer.parseInt(value.toString())));
                        continue;
                    case rlp.T_HINTTEXT /* 10120 */:
                        textView.setHint(rmm.c(value.toString()));
                        continue;
                    case rlp.T_HINTTEXT_COLOR /* 10121 */:
                        textView.setHintTextColor(rmm.a(value.toString()));
                        continue;
                    case rlp.T_LINES /* 10122 */:
                        textView.setLines(Integer.parseInt(value.toString()));
                        continue;
                    case rlp.T_NUMBER_OF_LINES /* 10123 */:
                    case rlp.T_MAX_LINES /* 10124 */:
                        textView.setMaxLines(Integer.parseInt(value.toString()));
                        continue;
                    case rlp.T_MIN_LINES /* 10125 */:
                        textView.setMinLines(Integer.parseInt(value.toString()));
                        continue;
                    case rlp.T_LINE_SPACING_EXTRA /* 10126 */:
                        if (!z) {
                            z = true;
                        }
                        f = Float.parseFloat(value.toString());
                        continue;
                    case rlp.T_LINE_SPACING_MULTIPLIER /* 10127 */:
                        if (!z) {
                            z = true;
                        }
                        f2 = Float.parseFloat(value.toString());
                        continue;
                    case rlp.T_SINGLE_LINE /* 10128 */:
                        textView.setSingleLine(Boolean.parseBoolean(value.toString()));
                        continue;
                    case rlp.T_LINE_TYPE /* 10129 */:
                        int parseInt = Integer.parseInt(value.toString());
                        if (parseInt == 2) {
                            textView.setPaintFlags(17);
                            continue;
                        } else if (parseInt == 3) {
                            textView.setPaintFlags(9);
                        }
                    case rlp.T_SHADOW /* 10130 */:
                        ShadowVO shadowVO = (ShadowVO) rlz.a().a((JSONObject) value, ShadowVO.class);
                        if (shadowVO != null) {
                            a(textView, shadowVO);
                        } else {
                            continue;
                        }
                    case rlp.T_EMS /* 10131 */:
                        textView.setEms(Integer.parseInt(value.toString()));
                        continue;
                    case rlp.T_BOLD_FONT_SIZE /* 10132 */:
                        textView.setTextSize(0, rmm.e(value.toString()));
                        textView.getPaint().setFakeBoldText(true);
                        continue;
                }
                rmn.a(th);
            }
            super.a((View) textView, hashMap, (rlw) null);
            if (z) {
                textView.setLineSpacing(f, f2);
            }
            if (fontVO != null) {
                a(textView, fontVO);
            }
            if (fontColorSelectorVO == null) {
                return;
            }
            a(textView, fontColorSelectorVO);
        }
    }

    private void a(TextView textView, ShadowVO shadowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e445fc7c", new Object[]{this, textView, shadowVO});
        } else if (shadowVO == null) {
        } else {
            textView.setShadowLayer(rmm.f(shadowVO.shadowRadius), rmm.e(shadowVO.shadowOffsetX), rmm.e(shadowVO.shadowOffsetY), rmm.a(shadowVO.shadowColor));
        }
    }

    private void a(TextView textView, FontVO fontVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a235ed", new Object[]{this, textView, fontVO});
        } else if (fontVO == null) {
        } else {
            if (!StringUtils.isEmpty(fontVO.fontSize)) {
                textView.setTextSize(0, rmm.e(fontVO.fontSize));
            }
            a(textView, fontVO.familyName);
            if (fontVO.fontWeight > 400) {
                textView.getPaint().setFakeBoldText(true);
            } else {
                textView.getPaint().setFakeBoldText(false);
            }
        }
    }

    private void a(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccae9a6", new Object[]{this, textView, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if ("monospace".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.MONOSPACE);
            } else if ("serif".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.SERIF);
            } else if ("sans_serif".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.SANS_SERIF);
            } else if ("default_bold".equalsIgnoreCase(str)) {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            } else if ("iconfont".equalsIgnoreCase(str)) {
                try {
                    if (this.f33234a == null) {
                        this.f33234a = Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/iconfont.ttf");
                    }
                    textView.setTypeface(this.f33234a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    textView.setTypeface(Typeface.DEFAULT);
                }
            } else {
                textView.setTypeface(Typeface.DEFAULT);
            }
        }
    }

    private void b(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56958b85", new Object[]{this, textView, str});
        } else if ("start".equals(str)) {
            textView.setEllipsize(StringUtils.TruncateAt.START);
        } else if ("middle".equals(str)) {
            textView.setEllipsize(StringUtils.TruncateAt.MIDDLE);
        } else if ("marquee".equals(str)) {
            textView.setEllipsize(StringUtils.TruncateAt.MARQUEE);
        } else {
            textView.setEllipsize(StringUtils.TruncateAt.END);
        }
    }

    private void a(TextView textView, FontColorSelectorVO fontColorSelectorVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5069eaf", new Object[]{this, textView, fontColorSelectorVO});
            return;
        }
        if (StringUtils.isEmpty(fontColorSelectorVO.titleNormalColor)) {
            fontColorSelectorVO.titleNormalColor = "#000000";
        }
        if (StringUtils.isEmpty(fontColorSelectorVO.titleDisabledColor)) {
            fontColorSelectorVO.titleDisabledColor = fontColorSelectorVO.titleNormalColor;
        }
        if (StringUtils.isEmpty(fontColorSelectorVO.titleHighlightedColor)) {
            fontColorSelectorVO.titleHighlightedColor = fontColorSelectorVO.titleNormalColor;
        }
        if (StringUtils.isEmpty(fontColorSelectorVO.titleSelectedColor)) {
            fontColorSelectorVO.titleSelectedColor = fontColorSelectorVO.titleNormalColor;
        }
        textView.setTextColor(new ColorStateList(new int[][]{rmp.d, rmp.f33236a, rmp.b, rmp.c}, new int[]{rmm.a(fontColorSelectorVO.titleDisabledColor), rmm.a(fontColorSelectorVO.titleHighlightedColor), rmm.a(fontColorSelectorVO.titleSelectedColor), rmm.a(fontColorSelectorVO.titleNormalColor)}));
    }
}
