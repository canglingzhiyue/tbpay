package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.fqp;
import tb.gbg;
import tb.kge;

/* loaded from: classes.dex */
public class ax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-303206208);
    }

    @Deprecated
    public DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a7cf1c07", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        try {
            a(dXWidgetNode);
            b(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
            return dXWidgetNode;
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXCEPTION, com.taobao.android.dinamicx.exception.a.a(e)));
            return null;
        }
    }

    private void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null || dXWidgetNode.getDxv3VariableInfo() == null) {
        } else {
            dXWidgetNode.getDxv3VariableInfo().a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r26.getDataParsersExprNode() != null) goto L309;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ba A[Catch: all -> 0x062c, Exception -> 0x062f, TryCatch #1 {Exception -> 0x062f, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:210:0x0459, B:213:0x048d, B:217:0x049f, B:220:0x04d5, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096), top: B:289:0x0023, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d5 A[Catch: all -> 0x062c, Exception -> 0x062f, TryCatch #1 {Exception -> 0x062f, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:210:0x0459, B:213:0x048d, B:217:0x049f, B:220:0x04d5, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096), top: B:289:0x0023, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0569 A[Catch: all -> 0x062c, Exception -> 0x062f, TryCatch #1 {Exception -> 0x062f, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:210:0x0459, B:213:0x048d, B:217:0x049f, B:220:0x04d5, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096), top: B:289:0x0023, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x057e A[Catch: all -> 0x062c, Exception -> 0x062f, TryCatch #1 {Exception -> 0x062f, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:210:0x0459, B:213:0x048d, B:217:0x049f, B:220:0x04d5, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096), top: B:289:0x0023, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d7 A[Catch: all -> 0x062c, Exception -> 0x062f, TryCatch #1 {Exception -> 0x062f, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:210:0x0459, B:213:0x048d, B:217:0x049f, B:220:0x04d5, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096), top: B:289:0x0023, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe A[Catch: Exception -> 0x0159, all -> 0x062c, TryCatch #3 {all -> 0x062c, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:46:0x00cc, B:47:0x00d7, B:57:0x00fa, B:59:0x00fe, B:61:0x0108, B:63:0x0112, B:65:0x0122, B:71:0x0149, B:72:0x0151, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:86:0x0198, B:88:0x01a0, B:89:0x01a4, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:166:0x030b, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:178:0x035c, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:186:0x03b0, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:208:0x044c, B:210:0x0459, B:213:0x048d, B:215:0x0492, B:217:0x049f, B:220:0x04d5, B:222:0x04da, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096, B:282:0x0631), top: B:289:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151 A[Catch: Exception -> 0x0159, all -> 0x062c, TRY_LEAVE, TryCatch #3 {all -> 0x062c, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:46:0x00cc, B:47:0x00d7, B:57:0x00fa, B:59:0x00fe, B:61:0x0108, B:63:0x0112, B:65:0x0122, B:71:0x0149, B:72:0x0151, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:86:0x0198, B:88:0x01a0, B:89:0x01a4, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:166:0x030b, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:178:0x035c, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:186:0x03b0, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:208:0x044c, B:210:0x0459, B:213:0x048d, B:215:0x0492, B:217:0x049f, B:220:0x04d5, B:222:0x04da, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096, B:282:0x0631), top: B:289:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180 A[Catch: all -> 0x062c, Exception -> 0x062f, TryCatch #1 {Exception -> 0x062f, blocks: (B:6:0x0023, B:8:0x0029, B:9:0x0050, B:11:0x005b, B:13:0x0061, B:19:0x0075, B:21:0x007b, B:23:0x0081, B:35:0x009f, B:37:0x00a5, B:42:0x00b0, B:45:0x00c2, B:76:0x015b, B:78:0x0161, B:79:0x0164, B:53:0x00e3, B:55:0x00e9, B:56:0x00ec, B:81:0x0176, B:83:0x0180, B:85:0x018e, B:102:0x01cd, B:104:0x01d5, B:231:0x0553, B:108:0x020a, B:110:0x0214, B:112:0x021e, B:114:0x022e, B:115:0x024a, B:145:0x029c, B:146:0x02a0, B:147:0x02a8, B:149:0x02ac, B:151:0x02b6, B:153:0x02c0, B:155:0x02d0, B:156:0x02e8, B:157:0x02f0, B:159:0x02fa, B:161:0x0300, B:163:0x0306, B:168:0x0312, B:169:0x0341, B:171:0x0348, B:173:0x034e, B:175:0x0357, B:180:0x0364, B:181:0x0393, B:182:0x0398, B:197:0x0424, B:196:0x0420, B:189:0x03bb, B:192:0x03c7, B:194:0x03f1, B:195:0x041b, B:200:0x042d, B:202:0x0431, B:203:0x0439, B:206:0x0447, B:210:0x0459, B:213:0x048d, B:217:0x049f, B:220:0x04d5, B:227:0x04ea, B:229:0x0514, B:98:0x01b4, B:100:0x01ba, B:101:0x01bd, B:234:0x0569, B:235:0x056c, B:237:0x0572, B:239:0x057e, B:241:0x0587, B:243:0x058f, B:246:0x059b, B:248:0x05a3, B:250:0x05a7, B:252:0x05b0, B:253:0x05b3, B:254:0x05ba, B:256:0x05c0, B:258:0x05cd, B:259:0x05d1, B:261:0x05d7, B:263:0x05e8, B:265:0x05ee, B:267:0x05f4, B:269:0x05fe, B:272:0x061c, B:271:0x0613, B:273:0x061f, B:257:0x05c7, B:26:0x0089, B:28:0x008f, B:31:0x0096), top: B:289:0x0023, outer: #3 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0164 -> B:306:0x0175). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.taobao.android.dinamicx.widget.DXWidgetNode r26, com.taobao.android.dinamicx.DXRuntimeContext r27, com.taobao.android.dinamicx.DXRenderOptions r28) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.ax.b(com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.taobao.android.dinamicx.widget.DXWidgetNode r20, com.taobao.android.dinamicx.DXRuntimeContext r21) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.ax.b(com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    private void a(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c642fbdd", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setIntAttribute(j, dXWidgetNode.getDefaultValueForIntAttr(j));
        }
    }

    private void b(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef97511e", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setLongAttribute(j, dXWidgetNode.getDefaultValueForLongAttr(j));
        }
    }

    private void c(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18eba65f", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setDoubleAttribute(j, dXWidgetNode.getDefaultValueForDoubleAttr(j));
        }
    }

    private void d(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423ffba0", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setListAttribute(j, dXWidgetNode.getDefaultValueForListAttr(j));
        }
    }

    private void e(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9450e1", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setMapAttribute(j, dXWidgetNode.getDefaultValueForMapAttr(j));
        }
    }

    private void a(Context context, DXWidgetNode dXWidgetNode, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d0a71", new Object[]{this, context, dXWidgetNode, new Long(j), obj});
        } else {
            dXWidgetNode.setIntAttribute(j, gbg.a(dXWidgetNode.getEngine(), context, String.valueOf(obj), dXWidgetNode.getDefaultValueForIntAttr(j)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.util.List<com.taobao.android.dinamicx.s$a>] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c4 -> B:42:0x00d5). Please submit an issue!!! */
    public static int a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("548c4eeb", new Object[]{dXWidgetNode, dXRuntimeContext})).intValue();
        }
        if (dXWidgetNode.getDataParsersExprNode() == null) {
            z = false;
        }
        if (z && dXWidgetNode.getDataParsersExprNode().get(5802348655878590802L) != null) {
            fqp fqpVar = dXWidgetNode.getDataParsersExprNode().get(5802348655878590802L);
            Object obj = null;
            try {
                com.taobao.android.preview.a.a();
                obj = fqpVar.a(null, dXRuntimeContext);
                com.taobao.android.preview.a.a();
            } catch (Exception e) {
                if (DinamicXEngine.j()) {
                    e.printStackTrace();
                }
                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXPR_EVALUEATE_EXCEPTION));
            }
            try {
                if (obj instanceof String) {
                    String valueOf = String.valueOf(obj);
                    if (dXWidgetNode.getEnumMap() != null && dXWidgetNode.getEnumMap().get(5802348655878590802L) != null && dXWidgetNode.getEnumMap().get(5802348655878590802L).get(valueOf) != null) {
                        dXWidgetNode.setIntAttribute(5802348655878590802L, dXWidgetNode.getEnumMap().get(5802348655878590802L).get(valueOf).intValue());
                        dXRuntimeContext = dXRuntimeContext;
                    } else {
                        dXWidgetNode.setIntAttribute(5802348655878590802L, dXWidgetNode.getDefaultValueForIntAttr(5802348655878590802L));
                        dXRuntimeContext = dXRuntimeContext;
                    }
                } else {
                    dXWidgetNode.setIntAttribute(5802348655878590802L, dXWidgetNode.getDefaultValueForIntAttr(5802348655878590802L));
                    dXRuntimeContext = dXRuntimeContext;
                }
            } catch (Exception e2) {
                if (DinamicXEngine.j()) {
                    e2.printStackTrace();
                }
                ?? r9 = dXRuntimeContext.n().c;
                r9.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXPR_SET_VALUE));
                dXRuntimeContext = r9;
            }
        }
        return dXWidgetNode.getVisibility();
    }
}
