package tb;

import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.d;
import com.taobao.android.litecreator.sdk.editor.AbsEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.PasterChildNode;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.s;
import java.util.ArrayList;
import java.util.List;
import tb.mto;

/* loaded from: classes5.dex */
public class hff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1220549984);
    }

    public static String a(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21368631", new Object[]{meEditor, str});
        }
        if (meEditor != null) {
            return meEditor.getCoreEditor().getProperty(str, "clip", "project_id", "");
        }
        return null;
    }

    public static void a(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bf53c5", new Object[]{meEditor});
        } else if (meEditor == null) {
        } else {
            meEditor.selectProject("");
        }
    }

    public static void b(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46b90ae", new Object[]{meEditor, str});
        } else if (meEditor == null) {
        } else {
            meEditor.selectProject(str);
        }
    }

    public static boolean a(AbsEditInfo absEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41be07dc", new Object[]{absEditInfo})).booleanValue();
        }
        if (!(absEditInfo instanceof VideoEditInfo)) {
            return true;
        }
        VideoEditInfo videoEditInfo = (VideoEditInfo) absEditInfo;
        if (videoEditInfo.pasters == null || videoEditInfo.pasters.size() <= 0) {
            return true;
        }
        for (Paster paster : videoEditInfo.pasters) {
            if (paster.isTextStyle()) {
                return false;
            }
        }
        return true;
    }

    public static List<Pair<String, RectF>> a(Project project, MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d3b9c887", new Object[]{project, meEditor});
        }
        List<String> a2 = a(project, meEditor, "text");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a2) {
            float d = d(meEditor, str);
            float c = c(meEditor, str);
            float positionX = meEditor.getPositionX(str);
            float positionY = meEditor.getPositionY(str);
            float contentWidth = meEditor.getContentWidth(str);
            float contentHeight = meEditor.getContentHeight(str);
            float f = positionX - (d * contentWidth);
            float f2 = positionY - (c * contentHeight);
            arrayList.add(new Pair(str, new RectF(f, f2, contentWidth + f, contentHeight + f2)));
        }
        return arrayList;
    }

    public static float c(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("12442afd", new Object[]{meEditor, str})).floatValue() : a(meEditor, str, "canvas", "AnchorY");
    }

    public static float d(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("401cc55c", new Object[]{meEditor, str})).floatValue() : a(meEditor, str, "canvas", "AnchorX");
    }

    public static float f(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bcdfa1a", new Object[]{meEditor, str})).floatValue() : a(meEditor, str, "canvas", "xAnchor", 0.0f);
    }

    public static float g(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9a69479", new Object[]{meEditor, str})).floatValue() : a(meEditor, str, "canvas", "yAnchor", 0.0f);
    }

    public static float a(MeEditor meEditor, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbfd6fd3", new Object[]{meEditor, str, str2, str3})).floatValue();
        }
        if (meEditor != null && meEditor.getCoreEditor() != null) {
            return (float) meEditor.getCoreEditor().getProperty(str, str2, str3, (double) mto.a.GEO_NOT_SUPPORT);
        }
        return -1.0f;
    }

    public static float a(MeEditor meEditor, String str, String str2, String str3, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("83b0f42d", new Object[]{meEditor, str, str2, str3, new Float(f)})).floatValue() : (meEditor == null || meEditor.getCoreEditor() == null) ? f : (float) meEditor.getCoreEditor().getProperty(str, str2, str3, f);
    }

    public static List<String> a(Project project, MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5bd817d", new Object[]{project, meEditor, str});
        }
        if (project == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        meEditor.getTrackIdList(str, arrayList2);
        for (String str2 : arrayList2) {
            arrayList3.clear();
            meEditor.getClipIdList(str2, arrayList3);
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public static void a(final String str, final Project project, final MeEditor meEditor, final d<List<PasterChildNode>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8687e30", new Object[]{str, project, meEditor, dVar});
        } else {
            au.a(new Runnable() { // from class: tb.hff.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MeEditor meEditor2 = meEditor;
                    String a2 = hff.a(meEditor2, str);
                    hff.b(meEditor2, a2);
                    ArrayList arrayList = new ArrayList();
                    List<Pair<String, RectF>> a3 = hff.a(project, meEditor2);
                    new PasterChildNode();
                    for (Pair<String, RectF> pair : a3) {
                        String str2 = (String) pair.first;
                        RectF rectF = (RectF) pair.second;
                        String text = meEditor2.getText(str2);
                        PasterChildNode pasterChildNode = new PasterChildNode();
                        pasterChildNode.clipId = str2;
                        pasterChildNode.renderRectFValues = new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom};
                        pasterChildNode.content = text;
                        pasterChildNode.defContent = text;
                        pasterChildNode.projectId = a2;
                        arrayList.add(pasterChildNode);
                    }
                    hff.a(meEditor2);
                    dVar.a(arrayList);
                }
            }, 300L);
        }
    }

    public static void e(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df55fcb", new Object[]{meEditor, str});
        } else if (meEditor == null || meEditor.getCoreEditor() == null) {
        } else {
            if (StringUtils.isEmpty(str)) {
                str = s.q();
            }
            meEditor.getCoreEditor().setDefaultFontFile(str);
        }
    }
}
