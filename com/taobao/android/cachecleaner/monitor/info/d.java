package com.taobao.android.cachecleaner.monitor.info;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.node.FileNode;
import com.taobao.media.MediaConstant;
import java.util.Stack;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1661125582);
    }

    public static String a(com.taobao.android.cachecleaner.monitor.info.node.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de96bdff", new Object[]{aVar});
        }
        if (aVar == null) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString());
        if (!aVar.children().isEmpty()) {
            a(sb, aVar);
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, com.taobao.android.cachecleaner.monitor.info.node.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b7af46", new Object[]{sb, aVar});
            return;
        }
        sb.append(riy.ARRAY_START_STR);
        for (com.taobao.android.cachecleaner.monitor.info.node.a aVar2 : aVar.children()) {
            sb.append(aVar2.toString());
            if (!aVar2.children().isEmpty()) {
                a(sb, aVar2);
            }
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(riy.ARRAY_END_STR);
    }

    public static com.taobao.android.cachecleaner.monitor.info.node.a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.cachecleaner.monitor.info.node.a) ipChange.ipc$dispatch("aa19dd95", new Object[]{str, str2});
        }
        if (str2 == null || "".equals(str2) || MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(str2)) {
            return null;
        }
        Stack stack = new Stack();
        int length = !str2.contains(riy.ARRAY_START_STR) ? str2.length() : str2.indexOf(riy.ARRAY_START_STR);
        FileNode fileNode = new FileNode(str, str2.substring(0, length));
        FileNode fileNode2 = fileNode;
        while (length < str2.length()) {
            char charAt = str2.charAt(length);
            if (charAt != ',') {
                if (charAt == '[') {
                    stack.push(fileNode2);
                } else if (charAt == ']') {
                    stack.pop();
                } else if (charAt != '{') {
                    continue;
                } else {
                    int indexOf = str2.substring(length).indexOf(125) + 1;
                    FileNode fileNode3 = !stack.isEmpty() ? (FileNode) stack.peek() : null;
                    int i = indexOf + length;
                    if (length >= i) {
                        return null;
                    }
                    FileNode fileNode4 = new FileNode(fileNode3, str2.substring(length, i));
                    if (fileNode3 != null) {
                        fileNode3.addChild(fileNode4);
                    }
                    length = i;
                    fileNode2 = fileNode4;
                }
            }
            length++;
        }
        return fileNode;
    }
}
