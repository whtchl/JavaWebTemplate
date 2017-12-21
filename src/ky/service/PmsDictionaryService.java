
package ky.service;

import ky.entity.PmsDictionary;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ky.util.PageView;

/**
* ********************************************************
* @ClassName: PmsDictionaryService
* @Description: ???
* @author 生成service类
* @date 2015-06-03 上午 11:56:01 
*******************************************************
*/
@Service
public interface PmsDictionaryService{

	public PageView selectPage(PageView pageView) ;
	public List<PmsDictionary> selectList(PmsDictionary obj);
	public int save(PmsDictionary obj);
	public int delete(String idArray);
	public int update(PmsDictionary obj);

}

