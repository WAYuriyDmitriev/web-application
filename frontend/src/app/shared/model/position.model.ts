import { Department } from './department.model';

export interface Position {
  id: number;
  name: string;
  baseSalary: number;
  allowance: number;
  reward: number;
  department: Department;

  departmentName?: string;
  departmentDirection?: string;
}
