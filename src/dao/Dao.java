package dao;

import java.util.List;

import bean.HotQA;

public interface Dao {
	
	public abstract void save(HotQA qa,int child_topic_id);
	
	public abstract HotQA get(int answer_id);
	
	//ͨ��child_topic_id����ѯһ���ӻ������������
	public abstract List<HotQA> list(int child_topic_id);

}
