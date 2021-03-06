package org.zongf.wx.power.nation.po;

public class WeekItemPO {

    // 主键ID
    private Long id;

    // 外键ID
    private Long weekId;

    // 类型: 填空题  单选题  多选题
    private String type;

    // 序号
    private int seqNo;

    // 标题
    private String title;

    // 答案
    private String answers;

    // 选项
    private String options;

    public WeekItemPO() {
    }

    public WeekItemPO(String type, int seqNo, String title, String answers) {
        this.type = type;
        this.seqNo = seqNo;
        this.title = title;
        this.answers = answers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWeekId() {
        return weekId;
    }

    public void setWeekId(Long weekId) {
        this.weekId = weekId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }
}
