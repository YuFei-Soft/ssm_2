package util;
//公共的计算页的实体方法
import java.util.List;

public class PageBean<T> {
	//页号
	private Integer pageNo;
	//当前每页有多少条数据
	private Integer pageSize=3;
	//当前页数据
	private List<T>  list;
	//总的页数
	private Integer  totalPage;
	//总的条数
	private Integer totalCount;
	//上一页
	private Integer prePage;
	//下一页
	private Integer nextPage;

	private  int start;

	public int getStart() {
		return start;
	}

	public void setStart( int start ) {
		this.start = start;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalCount() {
		return totalCount;
	}
	//设置总的条数
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		//计算总的页数
		totalPage=totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize+1);
		//页数验证
		if(pageNo<1) {
			pageNo=1;
		}else if(pageNo>totalPage) {
			pageNo=totalPage;
		}
		//设置上一页
		if(pageNo==1) {
			prePage=1;
		}else {
			prePage=pageNo-1;
		}
		//设置下一页 
		if(pageNo==totalPage) {
			nextPage=pageNo;
		}else {
			nextPage=pageNo+1;
		}
       start=(pageNo-1)*pageSize;
	}

	public Integer getPrePage() {
		return prePage;
	}

	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

}
